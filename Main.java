import java.util.Scanner;
/* нахождение факториала */

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println("факториал числа " + num + " равен " + factorial);
    }
}