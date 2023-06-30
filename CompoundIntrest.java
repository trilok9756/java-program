import java.util.Scanner;

public class CompoundIntrest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the principal ");
        double p = in.nextDouble();
        System.out.println("enter the year :");
        double y = in.nextDouble();
        System.out.println("enter the rate ");
        double r = in.nextDouble();
        double a = (1 + (r / 100));
        double temp = Math.pow(a, y);

        double CI = (p * temp) - p;
        System.out.println("Compond interest is : " + CI);
        in.close();
    }
}
