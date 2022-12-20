import java.util.Scanner;

public class SortTwoNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        System.out.println((a < b ? a : b));
        System.out.println((a < b ? b : a));

        in.close();
    }
}
