package com.grow_my_java.differrent_test.syberry_academy;

/******************************************************************************
 *  The program calls hello_Syberry(String name) function
 *  and prints out the greeting
 *
 *  Sample output:
 *  Hello, Syberry, my name is Test_User and I'm ready for tech interview
 ******************************************************************************/

public class Test {
    public static void hello_Syberry(String name) {
        System.out.println("Hello, Syberry, my name is " + name + " and I'm ready for tech interview");
    }

    public static void main(String[] args) {
        String name = "Constantine Havansky";
        hello_Syberry(name);
    }
}
