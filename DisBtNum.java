
import java.util.Scanner;

public class DisBtNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the point  of x1 = ");
        int x1 = in.nextInt();
        System.out.print("enter the point of x2 = ");
        int x2 = in.nextInt();
        System.out.print("enter the point  of y1 = ");
        int y1 = in.nextInt();
        System.out.print("enter the point  of y2 = ");
        int y2 = in.nextInt();
        double distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println(
                "distance between two point is (" + x1 + "," + x2 + ")" + "(" + y1 + "," + y2 + ") = " + distance);
        in.close();
    }
}
