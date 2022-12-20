import java.util.Scanner;

public class Autori {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String names[] = input.split("-");
        for(String s : names) {
            System.out.print(s.charAt(0));
        }
        System.out.println();
        in.close();
    }
}
