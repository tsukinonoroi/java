package org.example;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        while (arr.size() <= 2) {
            String str = scan.next();
            arr.add(str);
        }
        System.out.println(longestPrefix(arr));

    }


    public static StringBuilder longestPrefix(ArrayList<String> arr) {
    int i = 0;
    StringBuilder stringBuilder = new StringBuilder("");
    while(true) {

        if (arr.get(0).substring(i, i + 1).equals(arr.get(1).substring(i, i + 1))
                &&
                arr.get(0).substring(i, i + 1).equals(arr.get(1).substring(i, i + 1)))
        {
            stringBuilder.append(arr.get(0).substring(i, i + 1));
            i++;
        }
        else {
            return stringBuilder;
        }
    }
    }

}