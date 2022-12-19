import java.util.Scanner;

public class ShatteredCake {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int w = in.nextInt();
        int n = in.nextInt();

        int sum = 0;
        for (int i = 0; i < n; i++) {
            int width = in.nextInt();
            int length = in.nextInt();

            sum += width*length;
        }

        System.out.println(sum/w);
        in.close();
    }
}
