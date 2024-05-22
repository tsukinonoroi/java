package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the num : ");
        double num = scan.nextDouble();
        System.out.print("Enter the power : ");
        double x = scan.nextDouble();
        System.out.println(pow(num,x));
    }

    public static double pow(double num, double x) {
        if (x == 1) {
            return 1.0;
        }
        double result = 1.0;
        double absX = Math.abs(x);
        for (int i = 0; i < absX; i++) {
            result *= num;
        }

        if (x < 0) {
            result = 1/result;
        }
        return result;
    }
}