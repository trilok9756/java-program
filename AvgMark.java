import java.util.Scanner;

public class AvgMark {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("how many subject ");
        int n = in.nextInt();
        double[] m = new double[n];
        double sum = 0;
        double avg;
        System.out.println("enter the student marks ");
        for (int i = 0; i < n; i++) {
            m[i] = in.nextInt();
            sum = sum + m[i];

        }

        avg = sum / n;
        System.out.println("average of the number " + avg);
        in.close();

    }
}
