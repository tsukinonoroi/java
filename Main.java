import java.util.Scanner;
// Найти такую пару элементов в массиве, чья сумма даст значение переменной target //////////
public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int target = 9;
        for (int start = 0; start < arr.length; start++) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[start] + arr[i] == target) {
                    System.out.println("Indexes of array " + start + "," + i);
                }

                }
            }
        }
    }