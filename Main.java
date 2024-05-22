package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     List<Integer> list1 = new ArrayList<>();
     List<Integer> list2 = new ArrayList<>();
     Scanner scan = new Scanner(System.in);
     while (list1.size() < 3) {
         list1.add(scan.nextInt());
     }
        System.out.println("list 1 ---> : " + list1);
     while (list2.size() < 3) {
         list2.add(scan.nextInt());
     }
        System.out.println("list 2 ---> : " + list2);
        List<Integer> merge = new ArrayList<>();
        list1.addAll(list2);
        Collections.sort(list1);
        System.out.println("merged & sorted lists ---> " + list1);
    }
}