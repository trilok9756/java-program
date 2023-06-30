import java.util.Scanner;

public class SumOddPosNeg {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sumodd = 0;
        int sumeven = 0;
        int sumNeg = 0;
        while (true) {
            int num = in.nextInt();
            if (num == 0) {
                System.out.println("exit code :");
                break;
            }
            if (num < 0) {
                sumNeg = sumNeg + num;
            }
            if (num % 2 == 0) {
                sumeven = sumeven + num;
            }
            if (num % 2 != 0 && num > 0) {
                sumodd = sumodd + num;
            }
        }
        System.out.println("sum negative\n = " + sumNeg + "\n sumeven \n = " + sumeven + "\n sumodd = \n" + sumodd);
        in.close();
    }
}
