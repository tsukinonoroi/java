import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();
        System.out.println(is_palindrome(string));
    }

    public static boolean is_palindrome(String string) {
        StringBuilder newstr = new StringBuilder(string);
        newstr.reverse();
        boolean a = true, b = false;
        if (string.equals(newstr.toString())) {
            return a;
        }
        else {
            return b;
        }
    }
}

