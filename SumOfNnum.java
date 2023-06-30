import java.util.Scanner;

public class SumOfNnum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum = sum + i;
        }
        System.out.println("total sum of the N number : " + sum);
        in.close();
    }

}
