import java.util.Scanner;

public class Inputx {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        while (true) {
            String input = in.nextLine();
            if (input.equals("x")) {
                break;
            }
            int number = Integer.parseInt(input);
            sum = sum + number;

        }
        System.out.println("sum is : " + sum);
        in.close();

    }
}
