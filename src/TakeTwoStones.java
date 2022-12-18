import java.util.Scanner;

public class TakeTwoStones {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println((n % 2 == 1 ? "Alice" : "Bob"));
        in.close();
    }
}
