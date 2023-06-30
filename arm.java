import java.util.Scanner;

public class arm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        double r, sum = 0;
        String str = String.valueOf(num);
        int p = str.length();
        int temp = num;

        while (num > 0) {
            r = num % 10;

            sum = sum + Math.pow(r, p);

            num = num / 10;
        }

        if (temp == sum) {
            System.out.println(
                    "number is armstron because sum of particular number is " + temp + " = " + " sum is " + sum);
        } else {

            System.out.println("number is not armstrong beacuse: " + " sum is " + sum + " != " + temp);
        }
        in.close();
    }
}
