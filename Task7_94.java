package com.company;

import java.util.Scanner;

public class Task7_94 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();

        System.out.println(power(a,n));
    }
    static int power(int a, int n) {
        if( n == 1) {
            return a;
        }
        else {
            return power(a, n-1)*a;
        }
    }
}
