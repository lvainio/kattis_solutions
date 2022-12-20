import java.util.Scanner;

public class Bijele {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int king = in.nextInt();
        System.out.println(1 - king); // 1

        int queen = in.nextInt();
        System.out.println(1 - queen); // 1

        int rooks = in.nextInt();
        System.out.println(2 - rooks); // 2

        int bischops = in.nextInt();
        System.out.println(2 - bischops); // 2

        int knights = in.nextInt();
        System.out.println(2 - knights); // 2

        int pawns = in.nextInt();
        System.out.println(8 - pawns); // 8

        in.close();
    }
}
