import java.util.Scanner;

public class QualityAdjustedLifeYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        double sum = 0;
        for (int i = 0; i < n; i++) {
            double q = in.nextDouble();
            double y = in.nextDouble();
            sum += q*y;
        }
        System.out.println(sum);
        in.close();
    }
}
