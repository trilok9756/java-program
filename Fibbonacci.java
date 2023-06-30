
import java.util.Scanner;

public class Fibbonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number ");
        int num = in.nextInt();
        // int sum = 0;
        int a = 0;
        int b = 1;
        System.out.println(a + "\n \n" + b);

        // for (int i = 2; i < num; i++) {
        // sum = a + b;
        // System.out.println(sum);
        // a = b;
        // b = sum;
        // }
        // using while loop
        int count = 2;
        int temp;

        while (count <= num) {

            temp = b;
            b = a + b;
            a = temp;
            count++;
            System.out.println(b);
        }
        System.out.println(b);
        in.close();
    }
}
