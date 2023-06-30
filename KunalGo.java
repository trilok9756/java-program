import java.util.Scanner;

public class KunalGo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the month ");
        int monthday = in.nextInt();
        int count = 0;
        if (monthday <= 31) {
            for (int i = 1; i <= monthday; i++) {
                if (i % 2 == 0) {
                    count++;

                }
            }
            System.out.println("kunal go to in the month   = " + count);

        }
        in.close();

    }

}
