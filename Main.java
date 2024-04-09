package org.example;
import java.math.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import static java.lang.Math.pow;

/*У числа 24 восемь делителей: 1, 2, 3, 4, 6, 8, 12 и 24.
Существует десять чисел не больше 100, имеющих ровно восемь делителей:
24, 30, 40, 42, 54, 56, 66, 70, 78 и 88.
Пусть f(n) будет количеством чисел не больше n с ровно восемью делителями.
Известно, что f(100) = 10, f(1000) = 180 и f(10^6) = 224427.
Найдите f(10^9). */
public class Main {
    public static final int myNum = 1000000;
    public static void main(String[] args) {
        int countNums = 0;
        int count = 0;
        for (int i = 1; i <= myNum; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count += 1;
                }

            }
        if (count != 8) {
            count = 0;
        }
        else {
            countNums += 1;
            count = 0;
        }
        }
        System.out.println(countNums);
    }
}
