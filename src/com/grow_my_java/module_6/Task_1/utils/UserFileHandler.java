package com.grow_my_java.module_6.Task_1.utils;

import com.grow_my_java.module_6.Task_1.source.user.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UserFileHandler {

    private static String csvFile = "C:/Users/RGReeTy/IdeaProjects/GrowMyJava/src/com/grow_my_java/module_6/Task_1/data/users.csv";

    public static List<User> loadUsers() {
        String line;
        String splitBy = " ";
        List<User> users = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(csvFile))) {
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(splitBy);
                User user = new UserBuilder(data[5], data[6]).withName(data[0])
                        .withLastname(data[1])
                        .setSex(SEX.valueOf(data[2].toUpperCase()))
                        .setRole(Role.valueOf(data[3].toUpperCase()))
                        .setEmail(new Email(data[4]))
                        .setSalt(data[7])
                        .build();
                users.add(user);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return users;
    }

    /**
     * Save user list in the csv file in the next format:
     * "name,lastname,sex,role,email,username,securedPassword,salt".
     */

    public static void saveUserList(List<User> users) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(csvFile))) {
            for (User user : users) {
                StringBuilder sb = new StringBuilder();
                sb.append(user.getName());
                sb.append(",");
                sb.append(user.getLastname());
                sb.append(",");
                sb.append(user.getSex().name().toLowerCase());
                sb.append(",");
                sb.append(user.getRole().name().toLowerCase());
                sb.append(",");
                sb.append(user.getEmail());
                sb.append(",");
                sb.append(user.getUsername());
                sb.append(",");
                sb.append(user.getPassword());
                sb.append(",");
                sb.append(user.getSalt());

                bw.write(sb.toString());
                bw.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}