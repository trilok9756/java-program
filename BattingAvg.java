import java.util.Scanner;

public class BattingAvg {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enetr the total run of player = ");
        double run = in.nextInt();
        System.out.println("enter the total inining : ");
        int inining = in.nextInt();
        System.out.println("how many time  he was not out : ");
        int notout = in.nextInt();
        double battingAvg = run / (inining - notout);
        System.out.println("Batting average is : " + battingAvg);
        in.close();
    }
}
