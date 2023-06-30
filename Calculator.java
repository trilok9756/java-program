
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // System.out.print("enter the first number : ");
        // long num1 = in.nextLong();
        // System.out.print("enter the second number : ");
        // long num2 = in.nextLong();
        // String op = in.next();
        // if (op.equals("+")) {
        // double add = num1 + num2;

        // System.out.println("addition of " + num1 + " and " + num2 + " is " + add);
        // } else if (op.equals("-")) {
        // long sub = num1 - num2;
        // System.out.println("Subtract of " + num1 + " and " + num2 + " is " + sub);

        // } else if (op.equals("*")) {
        // double mul = num1 * num2;
        // System.out.println("multiply of " + num1 + " and " + num2 + " is " + mul);
        // } else if (op.equals("/")) {
        // long div = num1 / num2;
        // System.out.println("divide of " + num1 + " and " + num2 + " is " + div);
        // }
        int ans = 0;
        while (true) {
            System.out.print("enter the operator : ");
            char op = in.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.print("enter the number : ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();
                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                }
                if (op == '%') {
                    ans = num1 % num2;
                }

            } else if (op == 'x' || op == 'X') {
                break;
            } else {
                System.out.println("you enter wrong operator ");
            }
            System.out.println(ans);
        }

        in.close();
    }
}
