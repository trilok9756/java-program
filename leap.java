import java.util.Scanner;

public class leap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the year : ");
        int num = in.nextInt();
        int num2 = in.nextInt();
        // if (num % 4 == 0 || num % 100 != 0) {
        // System.out.println("year is leap year ");
        // } else if (num % 400 == 0) {
        // System.out.println("year is leap year ");
        // } else {
        // System.out.println("year is not leap year : ");
        // }
        int temp;
        while (num2 != 0) {
            temp = num2;
            num2 = num % num2;
            num = temp;
        }
        int hcf = num;
        System.out.println(num);
        in.close();
    }
}
