import java.util.ArrayList;
import java.util.Scanner;

public class S12012DontPassBall {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int J = scan.nextInt();
        int combinations = 0;

        if (J < 4) {
            System.out.print(0);
            return;
        }

        for (int i = J-1; i >= 3; i--) {
            for (int j = i-1; j >= 2; j--) {
                for (int k = j - 1; k >= 1; k--) {
                    combinations++;
                }
            }
        }

        System.out.print(combinations);
    }
}
