import java.util.Scanner;
import java.util.Arrays;
// Создание динамического двумерного массива, поиск максимального и минимального элемента в нем
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();
        int columns = scan.nextInt();

        int[][] matrix = new int[columns][rows];

        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                int value = scan.nextInt();
                matrix[i][j] = value;
            }
        }

        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int min = matrix[0][0];
        int max = matrix[0][1];

        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
                else if (matrix[i][j] > max || matrix[i][j] > min) {
                    max = matrix[i][j];
                }
            }
        }

        System.out.println("Max el = " + max);
        System.out.println("Min el = " + min);
    }
}
