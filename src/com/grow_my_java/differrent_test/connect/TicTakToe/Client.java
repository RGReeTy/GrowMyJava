package com.grow_my_java.differrent_test.connect.TicTakToe;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class Client {
    public static void main(String[] ar) {
        int serverPort = 5555;
        String address = "127.0.0.1"; // это IP-адрес компьютера, где исполняется наша серверная программа.
        // Здесь указан адрес того самого компьютера где будет исполняться и клиент.

        try {
            InetAddress ipAddress = InetAddress.getByName(address); // создаем объект который отображает вышеописанный IP-адрес.
            System.out.println("Any of you heard of a socket with IP address " + address + " and port " + serverPort + "?");
            Socket socket = new Socket(ipAddress, serverPort); // создаем сокет используя IP-адрес и порт сервера.
            System.out.println("Yes! I just got hold of the program.");


            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            // Создаем поток для чтения с клавиатуры.
            BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
            String line = null;
            System.out.println("Let win that!");

            boolean flag = true;
            while (true) {
                System.out.println("Write 2 numbers");
                out.println(keyboard.readLine());
                out.println(keyboard.readLine());
                line = in.readLine(); // ждем пока сервер отошлет строку текста.
                System.out.println("Server sent me this : " + line);

                if (line != "YOU WIN!\n" || line != "Sorry, table is full!\n") {
                    flag = false;
                }
            }
        } catch (Exception x) {
            x.printStackTrace();
        }
    }
}
