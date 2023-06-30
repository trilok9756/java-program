import java.util.Scanner;

import javax.swing.SortingFocusTraversalPolicy;

public class OddEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        Oddeven(num);
        in.close();

    }

    public static void Oddeven(int num) {
        if (num % 2 == 0) {
            System.out.println("number is even");
        } else {
            System.out.println("number is odd");
        }
    }
}
