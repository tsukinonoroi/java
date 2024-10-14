package org.example;


import java.util.Random;

public class Main  {
    public static int size = 5_00_000_000;
    public static int arr[] = new int[size];
    public static void main(String[] args) throws InterruptedException{

        Random r = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = r.nextInt(100);
        }

        sum(arr, size);
        threadSum(arr,size);
    }

    public static void sum(int[] arr, int size) {
        int sum = 0;
        var start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }
        var end = System.currentTimeMillis();

        System.out.println("Время выполнения перебором - " + (end - start) + "мс" + "\n" + "Сумма массива = " + sum);
    }

    public static void threadSum(int[] arr, int size) {

        SumThread thread1 = new SumThread(0, size/2, arr);
        SumThread thread2 = new SumThread(size/2, size, arr);

        var start = System.currentTimeMillis();
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        }
        catch (InterruptedException e ) {
            e.printStackTrace();
        }

        int totalSum = thread1.getPartialSum() + thread2.getPartialSum();
        var end = System.currentTimeMillis();
        System.out.println("Время выполнения параллельным сложением - " + (end - start) + "мс" + "\n" + "Сумма массива = " + totalSum);

    }

}

