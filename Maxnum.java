import java.util.Scanner;

public class Maxnum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the first number: ");
        int num = in.nextInt();
        System.out.print("enter the second number : ");
        int num2 = in.nextInt();
        int max = Math.max(num, num2);
        System.out.println("maximum number is  : " + max);
        in.close();

    }
}
