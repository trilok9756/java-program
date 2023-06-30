
import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the year : ");
        int year = in.nextInt();
        if (year % 400 == 0) {
            System.out.println(year + "  year is leap year");
        } else if (year % 100 == 0) {
            System.out.println(year + " is  not leap  year ");
        } else if (year % 4 == 0) {
            System.out.println(year + " year  is leap year");
        } else {
            System.out.println(year + "is not leap year ");
        }
        in.close();
    }
}
