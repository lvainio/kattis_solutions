import java.util.Scanner;

public class GCVWR {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        
        int g = stdin.nextInt();
        int t = stdin.nextInt();
        int n = stdin.nextInt();

        double tot = (g-t)*0.9;

        for (int i = 0; i < n; i++) {
            tot -= (double) stdin.nextInt();
        }

        System.out.println((int) tot);
    }
}
