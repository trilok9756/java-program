import java.util.Scanner;

public class CountNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int count = 0;
        while (num > 0) {
            int r = num % 10;
            if (r == 5) {
                count++;
            }
            num = num / 10;
        }
        System.out.println(count);
        in.close();
    }
}
