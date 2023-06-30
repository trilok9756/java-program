import java.util.Scanner;

public class CommisionPercentage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the amount : ");
        int amount = in.nextInt();
        System.out.println("enter the commision percentage : ");
        int CommisionPer = in.nextInt();
        double commision = amount * CommisionPer / 100;
        System.out.println("commision is : " + commision);
        in.close();

    }
}
