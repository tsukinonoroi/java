package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> heaps = new ArrayList<>();
        int heap1 = scan.nextInt();
        heaps.add(heap1);
        int heap2 = scan.nextInt();
        heaps.add(heap2);
        int heap3 = scan.nextInt();
        heaps.add(heap3);

        Collections.sort(heaps, Collections.reverseOrder());
        System.out.println(heaps.get(0) + " : количество монет в самой большой куче");
        

        }


    }
