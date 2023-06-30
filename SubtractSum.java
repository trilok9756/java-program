import java.util.Scanner;

public class SubtractSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int product = a * b;
        int sum = a + b;
        int sub = product - sum;
        System.out.println("product = " + product + " , sum is = " + sum);
        System.out.println("subtrct p and s is = " + sub);
        in.close();
    }
}
