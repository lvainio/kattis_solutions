import java.util.Scanner;

public class R2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int r1 = in.nextInt();
        int avg = in.nextInt();

        System.out.println(avg*2 - r1);
        in.close();
    }
}
