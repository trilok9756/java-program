import java.util.Scanner;

public class Cgpa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("how many subject ");
        int num = in.nextInt();
        double[] m = new double[num];
        double cgpa, sum = 0;
        double[] grade = new double[num];
        System.out.println("enter the subject number ");
        for (int i = 0; i < num; i++) {
            m[i] = in.nextInt();
        }
        for (int i = 0; i < num; i++) {
            grade[i] = m[i] / 10;
        }
        for (int i = 0; i < num; i++) {
            sum = sum + grade[i];
        }
        cgpa = sum / num;
        double percentage = cgpa * 9.5;
        System.out.println("cgpa is : " + cgpa);
        System.out.println("percentage is : " + percentage);
        in.close();

    }
}
