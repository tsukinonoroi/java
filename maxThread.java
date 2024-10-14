package org.example;

public class maxThread extends Thread {
    @Override
    public void run() {
        max = arr[0];
        for (int i = start; i < end; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
    }

    private int start;
    private int end;
    private int arr[];
    private int max;

    public maxThread(int start, int end, int[] arr) {
        this.start = start;
        this.end = end;
        this.arr = arr;
    }

    public  int getMax() {
        return max;
    }
}
