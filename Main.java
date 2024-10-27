package org.example;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        List<Integer> arr = new ArrayList<>();

        addElementToArr(arr, scan, size);

        System.out.println(arr);

        zeroToEnd(arr);

        System.out.println(arr);

    }

    public static void addElementToArr(List<Integer> arr, Scanner scan, int size) {
        for (int i = 0; i < size; i++) {
            arr.add(scan.nextInt());
        }
    }

    public static void zeroToEnd(List<Integer> arr) {
        Collections.sort(arr);
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == 0) {
                arr.addLast(arr.get(i));
                arr.remove(arr.get(i));
            }
        }
    }
}
