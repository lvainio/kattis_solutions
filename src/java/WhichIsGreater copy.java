import java.util.Scanner;

public class WhichIsGreater {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        System.out.println((a > b ? 1 : 0));

        in.close();
    }
}
