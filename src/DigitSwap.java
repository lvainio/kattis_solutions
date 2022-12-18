import java.util.Scanner;

public class DigitSwap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.print(s.charAt(1));
        System.out.print(s.charAt(0));
        in.close();
    }
}
