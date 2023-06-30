import java.util.Scanner;

public class Evenodd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the number :  ");
        int num = in.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " is even number");
        } else {
            System.out.println(num + " is odd number");
        }
        in.close();
    }
}
