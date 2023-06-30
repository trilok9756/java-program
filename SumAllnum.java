import java.util.Scanner;

public class SumAllnum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.println("enter the number : ");
            int num = in.nextInt();
            if (num != 0) {
                sum = sum + num;
            }
            if (num == 0) {
                System.out.println("exit code");
                break;

            }
        }
        System.out.println("sum of the all number : " + sum);
        in.close();
    }
}
