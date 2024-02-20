 import java.util.Scanner;

public class Vowels {
    public static void main(String args[]) {
        char ch;
        System.out.println("Enter the String");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);

            if (!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) {
                System.out.print(s.charAt(i));
            }
        }
    }
}
