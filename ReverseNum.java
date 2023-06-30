import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        System.out.println("enter the number : ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        int reverse = 0;
        while (num > 0) {
            int r = num % 10;
            num = num / 10;
            reverse = reverse * 10 + r;

        }
        System.out.println("revers is : " + reverse);
        in.close();
    }
}
