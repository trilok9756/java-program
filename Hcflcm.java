
import java.util.Scanner;

public class Hcflcm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int num1 = a;
        int num2 = b;
        int temp;
        while (num2 != 0) {
            temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        int gcd = num1;
        int lcm = (a * b) / gcd;
        System.out.println(lcm);
        System.out.println(gcd);
        in.close();
    }
}
