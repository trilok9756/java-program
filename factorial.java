import java.util.Scanner;

public class factorial {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number : ");
        int num = in.nextInt();
        int sum = num;
        for (int i = num - 1; i > 1; i--) {
            sum = sum * i;
        }
        System.out.println(num + "! = " + sum);
        in.close();

    }
}
