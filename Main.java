package org.example;


/*  */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> surnames = new ArrayList<>();
        String team = scan.nextLine();
        String surname1 = scan.nextLine();
        surnames.add(String.valueOf(surname1));
        String surname2 = scan.nextLine();
        surnames.add(String.valueOf(surname2));
        String surname3 = scan.nextLine();
        surnames.add(String.valueOf(surname3));

        Collections.sort(surnames);

        System.out.print(team + ": " + "\n" + surnames.get(0) + "\n" + surnames.get(1) +  "\n" + surnames.get(2));

    }
}
