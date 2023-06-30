import java.util.Scanner;

public class AvgNno {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        int sum = 0;

        for (int i = 0; i <= num; i++) {
            sum = sum + i;

        }
        double avg = sum / num;
        System.out.println("average is = " + avg);
        in.close();

    }
}
