
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int sum = 0, r;
        int temp = num;
        while (num > 0) {
            r = num % 10;
            sum = sum + (r * r * r);
            num = num / 10;
        }
        if (temp == sum) {
            System.out.println(temp + " is armstrong");
        } else {
            System.out.println(temp + " is not armstrong");
        }
        in.close();

    }
}
