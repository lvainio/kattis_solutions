import java.util.Scanner;

public class Betting {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        int p1 = stdin.nextInt();
        int p2 = 100-p1;

        System.out.println(1.0 + (double) p2 / p1);
        System.out.println(1.0 + (double) p1 / p2);   
    }
}
