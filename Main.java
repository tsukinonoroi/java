package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String lucky = scan.nextLine();
        if (lucky.length() != 6) {
            System.out.println("номер билета должен быть 6-ти значным");
        }

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < lucky.length(); i++) {
            char digitChar = lucky.charAt(i);
            arr.add(Integer.parseInt(String.valueOf(digitChar)));

        }

        int luck1 = arr.get(0) + arr.get(1) + arr.get(2);
        int luck2 = arr.get(3) + arr.get(4) + arr.get(5);

        if (luck1 == luck2) {
            System.out.println("LUCKY TICKET!");
        }
        else {
            System.out.println("UNLUCKY TICKET :( ");
        }


    }
}
