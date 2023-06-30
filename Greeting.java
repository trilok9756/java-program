import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the name ");
        String name = in.nextLine();
        System.out.println("Welcome " + name);
        in.close();
    }
}
