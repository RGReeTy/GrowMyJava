package com.grow_my_java.differrent_test.other;

import java.util.Scanner;

public class BankDepozitTask {
    /*    Typical task for a job interview.
Ann put MM money in the bank. The bank increases Ann's deposit by PP percent every year. Ann wants to know how many
years should pass until her deposit in the bank reaches KK money. Can you help her to answer this question?
Input contains three integers - M, P, KM,P,K. It is guaranteed that all numbers are positive and K \geq MK≥M.
Output the answer to Ann's question.
Sample Input 1:1 100 8
Sample Output 1:3
Sample Input 2:100 15 120
Sample Output 2:2
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double m = sc.nextInt();
        int p = sc.nextInt();
        int k = sc.nextInt();
        int year = 0;
        if (m != k) {

            while (k > m) {
                m += (m * p * 0.01);

                year++;
            }
        }
        System.out.println(year);
    }
}
