
import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s = in.nextLine();
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start++) != s.charAt(end--)) {
                System.out.println(s + " string is not palindrome");
                break;
            } else {
                System.out.println(s + "  string is palindrome");
                break;
            }
        }
        in.close();

    }
}
