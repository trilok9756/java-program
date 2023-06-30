import java.util.Scanner;

public class Simpleintrest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the principal : ");
        float principal = in.nextFloat();
        System.out.println("enter the time : ");
        int time = in.nextInt();
        System.out.println("enter the rate : ");
        float rate = in.nextFloat();
        float Simpleintrest = (principal * rate * time) / 100;
        System.out.println("simple intrest is : " + Simpleintrest);
        in.close();
    }
}
