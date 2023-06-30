import java.util.Scanner;

public class PerfectNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int sum = 0;
        int r;
        int temp = num;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
        if (sum == num) {
            System.out.println("number is perfect ");
        } else {
            System.out.println("not perfect");
        }
    }
}
