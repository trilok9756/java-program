import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the price : ");
        double price = in.nextDouble();
        System.out.println("enter the discount : ");
        int DisPer = in.nextInt();
        double discount = price * DisPer / 100;
        double s = price - discount;
        System.out.println("amount after Discount = " + s);
        in.close();

    }
}
