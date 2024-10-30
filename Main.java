package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
          list.add(scan.nextInt());
        }

        squareNums(list);
        Collections.sort(list);
        System.out.println(list);
        //
    }

    public static List<Integer> squareNums(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            int j = list.get(i);
            j*=j;
            list.set(i, j);
        }
        return list;
    }


}
