import java.util.Scanner;

public class RatingProblems {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // -3, -2, -1, 0, 1, 2, 3

        // avg = sum of ratings / num judges

        int numJudges = in.nextInt();
        int numAlreadyVoted = in.nextInt();

        int sum = 0;
        for (int i = 0; i < numAlreadyVoted; i++) {
            sum += in.nextInt();
        }

        double min = (sum - 3*(numJudges-numAlreadyVoted)) / (double) numJudges;
        double max = (sum + 3*(numJudges-numAlreadyVoted)) / (double) numJudges;

        System.out.println(min + " " + max);
        in.close();
    }
}
