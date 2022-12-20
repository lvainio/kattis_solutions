import java.util.Scanner;

public class Pot {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int n = stdin.nextInt();

        int sum = 0;
        for (int i = 0; i < n; i++) {
            int input = stdin.nextInt();
            int num = input / 10;
            int pow = input % 10;

            sum += (int) Math.pow((double) num, (double) pow);
        }

        System.out.println(sum);
        stdin.close();
    }
}
