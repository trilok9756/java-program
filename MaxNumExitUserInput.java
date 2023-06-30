import java.util.Scanner;

public class MaxNumExitUserInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int largest = Integer.MIN_VALUE;
        while (true) {
            System.out.print("enter the number : ");
            int input = in.nextInt();

            if (input == 0) {
                break;
            }
            if (input > largest) {
                largest = input;
            }

        }
        System.out.println(largest);
        in.close();
    }
}
