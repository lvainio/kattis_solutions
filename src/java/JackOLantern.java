import java.util.Scanner;

public class JackOLantern {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        int n = stdin.nextInt(); // num eye designs
        int t = stdin.nextInt(); // num nose designs
        int m = stdin.nextInt(); // num mouth designs
        System.out.println(n * t * m);

        stdin.close();
    }    
}
