import java.util.Scanner;

public class FYI {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(Integer.toString(s.nextInt()).substring(0, 3).equals("555") ? 1 : 0);
        s.close();
    }
}