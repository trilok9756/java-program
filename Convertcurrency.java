import java.util.Scanner;

public class Convertcurrency {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the ruppee : ");
        long rup = in.nextLong();
        long dol = rup / 83;
        System.out.println("ruppe in dollar is : " + dol);
        in.close();
    }
}
