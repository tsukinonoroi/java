package org.example;


import java.util.Random;

public class Main  {

    public static final int size = 100_000;
    public static int arr[] = new int[size];
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = r.nextInt(500_000);
        }

        findMax(size, arr);

    }

    public static void findMax(int size, int arr[]) {
        maxThread thread1 = new maxThread(0, size/2, arr);
        maxThread thread2 = new maxThread(size/2, size, arr);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        int max1 = thread1.getMax();
        int max2 = thread2.getMax();
        System.out.println(Math.max(max1, max2));
    }

}

