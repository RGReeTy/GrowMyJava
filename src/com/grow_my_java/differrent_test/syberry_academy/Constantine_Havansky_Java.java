package com.grow_my_java.differrent_test.syberry_academy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class Constantine_Havansky_Java {


//    1
//    Write a function largestOdd(arr) that takes an array arr and returns the largest odd number in it. If there are no odd
//    numbers, it should return an Exception e "No odd numbers found".
//
//    Input: arr = [2, 3, 4, 6, 7]
//    Output: 7

    public static int largestOdd(int[] arr) throws Exception {
        int number = 0;
        number = IntStream.of(arr).filter(x -> (x % 2) != 0).max().getAsInt();
        if (number != 0) {
            return number;
        } else {
            throw new Exception("No odd numbers found");
        }

    }


//    2
//    Let s be a string that contains a sequence of decimal numbers separated by commas, e.g., s = '1.23,2.4,3.123'. Write
//    a function sequenceSum(s) that prints the sum of the numbers in s.
//    Input: s = '1.1, 2, 3.9'
//    Output: 7

    public static Double sequenceSum(String s) {
        String[] temp = s.split(",");
        Double sum = 0.0;
        for (int i = 0; i < temp.length; i++) {
            sum += Double.parseDouble(temp[i]);
        }
        return sum;
    }

//            3
//    Write a function vowelsNumber(s) that accepts string s as a parameter and counts up the number of vowels contained in
//    the string. Valid vowels are: 'a', 'e', 'i', 'o', and 'u'.
//    Input: s = 'azcbobobegghakl'
//    Output: 5
//
//    Input: s = 'AzcbobObEgghaKL'
//    Output: 5

    public static int vowelsNumber(String s) {
        int count = 0;
        Pattern vowels = Pattern.compile("[aeiouAEIOU*]");
        Matcher m = vowels.matcher(s);
        while (m.find()) {
            count++;
        }
        return count;
    }


//            4
//    Write a function  contains(str1, str2) that accepts two strings str1 and str2 as arguments and returns a boolean True
//if either string occurs anywhere in the other, and False otherwise. Function should be case insensitive.
//            Input: s1 = 'abcd', s2 = 'bc'
//    Output: True
//
//    Input: s1 = 'ABcd', s2 = 'bC'
//    Output: True

    public static boolean contains(String str1, String str2) {
        return str1.toLowerCase().contains(str2.toLowerCase());
    }


//5
//    Write a function isPalindrome(s) that accepts string s as an argument and returns a boolean True if string reads the
//    same way backwards and forwards. The function should be case and spaces insensitive.
//            Input: s = ‘topot’
//    Output: True
//
//    Input: s = ‘TopOt’
//    Output: True
//
//    Input: s = ‘to pot’
//    Output: True
//
//    Input: s = ‘ropot’
//    Output: False

    public static boolean isPalindrome(String s) {
        String temp = s.replaceAll("\\s+", "").toLowerCase();
        return IntStream.range(0, temp.length() / 2).noneMatch(i -> temp.charAt(i) != temp.charAt(temp.length() - i - 1));
    }

//6
//    Write a function findExtremeDivisors(n1, n2). n1 and n2 should be positive ints. The function should return an Exception
//    e1 “Error: n1 and n2 should be positive ints!” if either n1 or n2 <= 0.
//    The function returns an array of two elements containing the smallest common divisor > 1 and the largest common
//    divisor of n1 and n2.
//    If the are no common divisors, the function should return an Exception e2 "There are no common divisors".
//    Input: n1 = 12, n2 = 6
//    Output: [2, 6]
//
//    Input: n1 = 21, n2 = 7
//    Output: [7, 7]

    public static int[] findExtremeDivisors(int n1, int n2) throws Exception {
        if (n1 <= 0 || n2 <= 0) {
            throw new Exception("Error:n1 and n2 should be positive ints !");
        }
        int[] arr = {0, 0};

        int gcd = 1;
        for (int i = 1; i <= n1 && i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        arr[1] = gcd;

        int lcd = 1;
        for (int i = n1; i >= 2; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                lcd = i;
            }
        }
        arr[0] = lcd;

        if (arr[0] == 0 || arr[1] == 0 || arr[0] == 1 || arr[1] == 1) {
            throw new Exception("There are no common divisors");
        }
        return arr;
    }

//            7
//    Write a function intersect(L1, L2). L1 and L2 are arrays. The function returns an array that is the intersection of L1 and L2.
//            Input: L1 = [1, 2, 'a', 'c'], L2 = [1, 'b', 'c', 'd', 'e', 2]
//    Output: [1, 2, 'c']
//
//    Use ArrayList


//8
//    Write a function called indexOfMax(arr) that takes an array arr of arbitrary numbers and returns the index of the largest element.
//    Input: arr = [1, 2, 3, 4, 1.2, 7, 1.4342, 2.222]
//    Output: 5

    public static double indexOfMax(double[] arr) {
        int index = -1;
        double max = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }
        return index;
    }


//            9
//    Write a function called letterHist(s) that takes a string s as a parameter and returns a string as a histogram of
//    the letters in the string s. The zeroth element of the histogram should contain the number of a’s in the string
//            (upper- and lowercase); the 25th element should contain the number of z’s. Your solution should only traverse the string once.
//
//    Input: s = 'cabAccCCde'
//    Output:
//    a = 2
//    b = 1
//    c = 5
//    d = 1
//    e = 1
//    f = 0
//    g = 0
//            ...
//    z = 0
//
//            10
//    Write a recursive function named isPalindromeRecursive(s) that takes a string s as a parameter and returns a
//    boolean indicating whether sthe word is a palindrome. The function should be case and spaces insensitive.
//
//            Input: s = ‘topot’
//    Output: True
//
//    Input: s = ‘to pot’
//    Output: True
//
//    Input: s = ‘TopOt’
//    Output: True
//
//    Input: s = ‘ropot’
//    Output: False

    public static boolean isPalindromeRecursive(String s) {
        if (s.length() == 0 || s.length() == 1)
            return true;
        if (s.charAt(0) == s.charAt(s.length() - 1))

            return isPalindromeRecursive(s.substring(1, s.length() - 1));


        return false;
    }
//
//    ONE TASK TO RULE THEM ALL
//    Given a matrix, write a function clockwiseSpiral(matrix) that takes the matrix as an input and prints it in
//    clockwise spiral form. See the following examples.
//
//    Examples:
//    Input:
//            [[1, 2, 3, 4],
//            [5, 6, 7, 8],
//            [9, 10, 11, 12],
//            [13, 14, 15, 16]]
//
//    Output:
//            1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
}
