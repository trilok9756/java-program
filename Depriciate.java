import java.util.Scanner;

public class Depriciate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int amount = in.nextInt();
        int depPercentage = in.nextInt();
        int year = in.nextInt();

        double temp = amount;
        for (int i = 0; i < year; i++) {
            temp = temp * (100 - depPercentage) / 100;

            System.out.println("after dep amount is = " + temp);

        }
        in.close();

    }
}
