import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        char ch;
        String s = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            ch = str.charAt(i);
            s = s + ch;
        }
        System.out.println(s);
        in.close();
    }
}
