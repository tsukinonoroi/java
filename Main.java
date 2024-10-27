package org.example;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        isPowerOfFour(num);

    }

    public static void isPowerOfFour(int num) {
        for (int i = 0; i < 100_000; i++) {
            if (pow(4, i) == num) {
                System.out.println("true" + " " + i);
                break;
            }
            else if(pow(4, i) > num) {
                System.out.println("false" + " " + i); //степень, которая превышает заданный юзером num ; юзер задал 325 (превышет 256(4 степень)), но не дотягивает до 1024(5 степень)
                break;
            }
        }
    }

    public static int pow(int number, int i) {
        int result = 1;
        for (int j = 0; j < i; j++) {
            result *= number;
        }
        return result;
    }
}
