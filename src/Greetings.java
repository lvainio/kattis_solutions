import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        String hey = stdin.nextLine();

        int numE = hey.length()-2;

        System.out.print("h");
        for (int i = 0; i < numE; i++) {
            System.out.print("ee");
        }
        System.out.println("y");

        stdin.close();
    }
}
