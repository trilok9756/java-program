import java.util.Scanner;

public class PowInJava {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        double power = Math.pow(num1, num2);

        System.out.println(power);
        in.close();
    }
}
