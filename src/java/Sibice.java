import java.util.Scanner;

public class Sibice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int w = in.nextInt();
        int h = in.nextInt();

        int length = (int) Math.sqrt(w*w+h*h);

        for (int i = 0; i < n; i++) {
            int match = in.nextInt();
            System.out.println(match <= length ? "DA" : "NE");
        }

        in.close();
    }
}
