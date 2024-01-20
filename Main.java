import java.util.Scanner;
import java.util.ArrayList;
/* Если выписать все натуральные числа меньше 10, кратные 3 или 5, то получим 3, 5, 6 и 9.
Сумма этих чисел равна 23.
Найдите сумму всех чисел меньше 1000, кратных 3 или 5.*/
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> chisla = new ArrayList<Integer>();
        int count = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 | i % 5 == 0) {
                count += i;
                chisla.add(i);
            }
        }
        System.out.println(chisla);
        System.out.println("Sum of numbers = " + count);
    }
}
