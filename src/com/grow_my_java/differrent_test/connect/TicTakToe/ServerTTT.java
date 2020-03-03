package com.grow_my_java.differrent_test.connect.TicTakToe;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

//http://www.quizful.net/post/java-socket-programming

public class ServerTTT {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int port = 5555; // случайный порт (может быть любое число от 1025 до 65535)
        try {
            ServerSocket ss = new ServerSocket(port); // создаем сокет сервера и привязываем его к вышеуказанному порту
            System.out.println("Waiting for a client...");

            Socket socket = ss.accept(); // заставляем сервер ждать подключений и выводим сообщение когда кто-то связался с сервером
            System.out.println("Got a client :) ... Let the game begin!\n");

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            // Ответ клиенту.
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            String line = "The game is started! Make a move (write a number 1-3 two times!)";
            boolean flag = true;
            int x = 0, y = 0;

            TicTacToe toe = new TicTacToe();
            out.println(line + "\n" + toe.printTable());
            out.flush();
            while (flag) {
                do {
                    out.println("Write a 2 numbers please!");
                    out.flush();
                    x = Integer.parseInt(in.readLine());
                    y = Integer.parseInt(in.readLine());
                    line = toe.makeAMove(x, y, 'X');
                    System.out.println(line);
                    out.println(line + "\n");
                    out.flush();
                    line = toe.makeAMove(makeAServerMove(), makeAServerMove(), 'O');
                    System.out.println(line);
                    out.println(line + "\n");
                    out.flush();
                } while (line != "YOU WIN!\n" || line != "Sorry, table is full!\n");
                if (line.equalsIgnoreCase("exit")) {
                    flag = false;
                }
            }
        } catch (Exception x) {
            x.printStackTrace();
        }
    }

    private static int makeAServerMove() {
        System.out.println("Write a number: (1-3)");
        return sc.nextInt();
    }
}
