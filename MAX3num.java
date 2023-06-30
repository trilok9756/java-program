import java.util.Scanner;

public class MAX3num {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        // int max = num1;
        // if (num2 > max) {
        // max = num2;
        // }
        // if (num3 > max) {
        // max = num3;
        // }
        int max = Math.max(num3, Math.max(num1, num2));
        System.out.println(max);
        in.close();

    }
}
