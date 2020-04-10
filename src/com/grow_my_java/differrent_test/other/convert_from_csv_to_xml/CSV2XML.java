package com.grow_my_java.differrent_test.other.convert_from_csv_to_xml;

/*
Creating XML document
Converts CSV file to XML
First line in CSV file is field/column names -
which is also used as element names while creating XML
document

CSV to XML
This class reads a CSV file and creates an XML document from it. The first line in the CSV
file is assumed to be the field/column names, and these names are used as element names in
the XML document. We call newDocument method on DocumentBuilder. This method returns an
instance of org.w3c.dom.Document class that is then used to create XML document by calling
methods such as createElement and appendChild.
Creating XML Document using DOM (CSV2XML.java)

The main function creates an instance of CSV2XML class and calls convertFile method. This
method starts reading the CSV file. It uses stringTokenizer to first get the column names
(from the first row) and then the actual data items (for each row starting second row in the
file) and creates XML elements.
The above code uses JAXP classes TransformerFactory and Transformer to save the
document. The alternative approach would be to use org.apache.crimson.tree.XmlDocument
class as below:
BufferedWriter bufferWriter =
new BufferedWriter(new FileWriter(xmlFileName));
XmlDocument xDoc = (XmlDocument)newDoc;
xDoc.write(bufferWriter);
bufferWriter.close();
*/

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.FactoryConfigurationError;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.*;
import java.util.StringTokenizer;

public class CSV2XML {
    // Protected Properties
    protected DocumentBuilderFactory domFactory = null;
    protected DocumentBuilder domBuilder = null;

    public CSV2XML() {
        try {
            domFactory = DocumentBuilderFactory.newInstance();
            domBuilder = domFactory.newDocumentBuilder();
        } catch (FactoryConfigurationError exp) {
            System.err.println(exp.toString());
        } catch (ParserConfigurationException exp) {
            System.err.println(exp.toString());
        } catch (Exception exp) {
            System.err.println(exp.toString());
        }
    }

    public static void main(String[] args) {
        args = new String[2];
        args[0] = "./product.csv";
        args[1] = "./second.xml";
        try {
            if (args.length != 2) {
                System.out.println("Usage: java CSV2XML <inputCSVFile><outputXMLFile>");
                return;
            }
        } catch (Exception exp) {
            System.err.println(exp.toString());
        }
        try {
            CSV2XML csvConverter = new CSV2XML();
            int rowsCount = csvConverter.convertFile(args[0], args[1]);
            if (rowsCount >= 0) {
                System.out.println("CSV File '" + args[0] + "' successfully converted to XML File '" +
                        args[1] + "'\n" +
                        "(" + String.valueOf(rowsCount) + " rows)");
//              set the TransformFactory to use the Saxon TransformerFactoryImpl method
                System.setProperty("javax.xml.transform.TransformerFactory",
                        "net.sf.saxon.TransformerFactoryImpl");
                TransformerFactory factory = TransformerFactory.newInstance();
                Templates template = factory.newTemplates(
                        new StreamSource(new FileInputStream("detailed.xslt")));
                Transformer transformer = template.newTransformer();
                Source source = new StreamSource(new FileInputStream("second.xml"));
                Result result = new StreamResult(new FileOutputStream("summary.xml"));
                transformer.transform(source, result);

            } else {
                System.out.println("Error while converting input CSV File '" + args[0] +
                        "' to output XML File '" + args[1] + "'");
            }
        } catch (Exception exp) {
            System.err.println(exp.toString());
        }
    }

    public int convertFile(String csvFileName, String xmlFileName) {
        int rowsCount = -1;
        try {
            Document newDoc = domBuilder.newDocument();
// Root element
            Element rootElement = newDoc.createElement("ROWSET");
            newDoc.appendChild(rootElement);
// Read comma seperated file
            BufferedReader csvReader;
            csvReader = new BufferedReader(new FileReader(csvFileName));
            int fieldCount = 0;
            String[] csvFields = null;
            StringTokenizer stringTokenizer = null;
// Assumption: first line in CSV file is column/field names
// As the column names are used to name the elements in the XML file,
// avoid using spaces/any other characters not suitable for XML element naming
            String curLine = csvReader.readLine();
            if (curLine != null) {
                stringTokenizer = new StringTokenizer(curLine, ";");
                fieldCount = stringTokenizer.countTokens();
                if (fieldCount > 0) {
                    csvFields = new String[fieldCount];
                    int i = 0;
                    while (stringTokenizer.hasMoreElements()) {
                        csvFields[i++] = String.valueOf(stringTokenizer.nextElement());
                    }
                }
            }

            for (int i = 0; i < csvFields.length; i++) {
                String csvField = csvFields[i].toUpperCase();
                csvFields[i] = csvField.replaceAll(" ", "_");

            }
// Now we know the columns, Let's now read data row lines
            while ((curLine = csvReader.readLine()) != null) {
                String strArr[] = curLine.split(";");
                String result = "";
                String temp = "";
                for (int i = 0; i < strArr.length; i++) {
                    if (strArr[i].equals(""))
                        temp = "(Blanks),";
                    else
                        temp = strArr[i] + ";";
                    result = result + temp;
                }

                curLine = result;

                int pp = 0;
                while (true) {
                    int found = curLine.indexOf("\"", pp);
                    if (found == -1) break;
                    int start = found + 1; // start of actual quote
                    int end = curLine.indexOf("\"", start);

                    String str1 = curLine.substring(start, end);
                    str1 = str1.replaceAll(",", "");
                    String str2 = "";
                    str2 = curLine.substring(end + 1, curLine.length());

                    if (found != 0) {
                        curLine = curLine.substring(0, start - 1) + str1 + str2;

                    } else {
                        curLine = str1 + str2;

                    }
                    pp = end + 1;  // advance i to start the next iteration
                }

                stringTokenizer = new StringTokenizer(curLine, ";");
                fieldCount = stringTokenizer.countTokens();
                if (fieldCount > 0) {
                    Element rowElement = newDoc.createElement("ROW");
                    int i = 0;
                    while (stringTokenizer.hasMoreElements()) {
                        try {
                            String curValue =
                                    String.valueOf(stringTokenizer.nextElement());
                            Element curElement =
                                    newDoc.createElement(csvFields[i++]);
                            curElement.appendChild(newDoc.createTextNode(curValue));
                            rowElement.appendChild(curElement);
                        } catch (Exception exp) {
                        }
                    }
                    rootElement.appendChild(rowElement);
                    rowsCount++;
                }
            }

            csvReader.close();
// Save the document to the disk file
            TransformerFactory tranFactory = TransformerFactory.newInstance();
            Transformer aTransformer = tranFactory.newTransformer();
            Source src = new DOMSource(newDoc);
            Result dest = new StreamResult(new File(xmlFileName));
            aTransformer.transform(src, dest);
            rowsCount++;
        } catch (IOException exp) {
            System.err.println(exp.toString());
        } catch (Exception exp) {
            System.err.println(exp.toString());
        }
        return rowsCount;
    }
}
