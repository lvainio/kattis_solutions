import java.util.Scanner;

public class DetailedDifferences {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        int n = stdin.nextInt();
        stdin.nextLine();

        for (int i = 0; i < n; i++) {
            String s1 = stdin.nextLine();
            String s2 = stdin.nextLine();

            System.out.println(s1);
            System.out.println(s2);

            for (int j = 0; j < s1.length(); j++) {
                if (s1.charAt(j) == s2.charAt(j)) {
                    System.out.print(".");
                } else {
                    System.out.print("*");
                }
            }

            System.out.println();
            System.out.println();
        }

        stdin.close();
    }
}
