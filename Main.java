import java.util.Arrays;
import java.util.Scanner;
// Создание динамического массива, вычисление минимального и максимального элемента в массиве
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the count of elements in array = ");
        int a = scan.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < arr.length; i++) {
            int value = scan.nextInt();
            arr[i] = value;
        }
        System.out.println("Array is = " + Arrays.toString(arr));
        int min = arr[0];
        int max = arr[1];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            else if (arr[i] > min || arr[i] > max) {
                max = arr[i];
            }
        }


        System.out.println("Minimal = " + min);
        System.out.println("Max = " + max);
    }
}