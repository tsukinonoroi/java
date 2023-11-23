/*
145 является любопытным числом, поскольку 1! + 4! + 5! = 1 + 24 + 120 = 145.
Найдите сумму всех чисел, каждое из которых равно сумме факториалов своих цифр.
Примечание: поскольку 1! = 1 и 2! = 2 не являются суммами, учитывать их не следует.
*/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        List<Integer> cia = toarr(num);
        System.out.println("Разбили число на цифры = " + cia);
        factorial(cia, num);
        String result = sravnenie(num, conresult(cia));
        System.out.println(result);
    }

    public static List<Integer> toarr(int num) {
        String str = Integer.toString(num);
        char[] charArray = str.toCharArray();
        List<Integer> cia = new ArrayList<>();
        for (int i = 0; i < charArray.length; i++) {
            int c = Character.getNumericValue(charArray[i]);
            cia.add(c);
        }
        return cia;
    }

    public static void factorial(List<Integer> cia, int num) {
        int conresult = 0;
        for (int j = 0; j < cia.size(); j++) {
            int digit = cia.get(j);
            int result = calculatefactorial(digit);
            System.out.println("Факториал цифры " + digit + " числа " + num + " : " + result);
            conresult += result;
        }
        System.out.println("Факториал всех цифр числа " + num + " = " + conresult);
    }

    public static int calculatefactorial(int args) {
        if (args == 0 || args == 1) {
            return 1;
        } else {
            return args * calculatefactorial(args - 1);
        }
    }

    public static String sravnenie(int num, int conresult) {
        String a = "Факториал цифр числа не равен числу ", b = "Факториал цифр числа равен числу";
        if (num == conresult) {
            return b;
        } else {
            return a;
        }
    }

    public static int conresult(List<Integer> cia) {
        int result = 0;
        for (int digit : cia) {
            result += calculatefactorial(digit);
        }
        return result;
    }
}
