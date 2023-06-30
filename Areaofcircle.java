import java.util.Scanner;

class Areaofcircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double r = in.nextInt();
        double area = 3.14 * r * r;
        System.out.println("Area of circle is : " + area);
        in.close();
    }
}