public class Problem {
    public static void main(String[] args) {
        int[] num = { 1, 2, 3, 4 };
        int target = 24;
        int sum = 0;
        for (int i = 0; i <= num.length - 1; i++) {
            sum = sum + num[i] % 10;
        }
        System.out.println(sum);

    }
}