import java.util.Scanner;

public class Tarifa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int monthlyMB = in.nextInt();
        int n = in.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += monthlyMB-in.nextInt();
        }

        System.out.println(monthlyMB + sum);
        in.close();
    }
}
