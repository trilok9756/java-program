import java.util.Scanner;

public class SecondMaxNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the number a = ");
        int a = in.nextInt();
        System.out.print("enter the number b = ");
        int b = in.nextInt();
        System.out.print("enter the number c = ");
        int c = in.nextInt();
        int max;
        if (a > b && a > c) {
            max = Math.max(b, c);
        }
        if (b > a && b > c) {
            max = Math.max(a, c);

        } else {
            max = Math.max(a, b);
        }
        System.out.println(max);
        in.close();
    }

}
