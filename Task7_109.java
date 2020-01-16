package com.company;

import java.util.Scanner;

public class Task7_109 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(gdc(a, b));
    }


    public static int gdc(int a, int b) {
        if( a == b) {
            return a;
        }
        if (a > b) {
            return gdc(b, a - b);
        }
        else {
            return gdc(a, b - a);
        }
    }
}
