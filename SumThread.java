package org.example;

public class SumThread extends Thread {

    private int startIndex;
    private int endIndex;
    private int[] array;
    private int partialSum = 0;

    public int getPartialSum() {
        return partialSum;
    }

    public SumThread(int startIndex, int endIndex, int[] array) {
        this.startIndex = startIndex;
        this.endIndex = endIndex;
        this.array = array;
    }

    public void run() {
        for (int i = startIndex; i < endIndex; i++) {
            partialSum += array[i];
        }
    }
}
