import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int table = 0;
        int i = 1;
        while (i <= 10) {
            table = i * num;
            i++;
            System.out.println(table);
        }
        in.close();
    }
}
