import java.util.Arrays;
import java.util.Scanner;

public class S32017NailedIt {
    static int[] boards = new int[2001];

    public static int calculateBoards(int target) {
        int length = 0;
        int top = Math.min(target, 2000);
        int bottom = target - top;

        while (bottom < top) {
            length += Math.min(boards[bottom], boards[top]);
            bottom++;
            top--;
        }
        if (bottom == top) {
            length += boards[bottom] / 2;
        }
        return length;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int max = 0;
        int combos = 0;

        Arrays.fill(boards, 0);

        for (int i = 0; i < N; i++) {
            boards[scan.nextInt()]++;
        }

        for (int i = 2; i < 4000; i++) {
            int length = calculateBoards(i);
            if (length > max) {
                max = length;
                combos = 1;
            } else if (length == max) combos++;
        }

        System.out.print(max + " " + combos);
    }
}
