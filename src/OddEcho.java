import java.util.Scanner;

public class OddEcho {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();

        for (int i = 1; i <= n; i++) {
            String word = in.nextLine();
            if(i % 2 == 1) {
                System.out.println(word);
            }
        }

        in.close();
    }
}
