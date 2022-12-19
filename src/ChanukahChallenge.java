
import java.util.Scanner;

public class ChanukahChallenge {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            in.nextInt();
            int p = in.nextInt();
            System.out.println(i + " " + (p+p*(p+1)/2));
        }

        in.close();
    }
}
