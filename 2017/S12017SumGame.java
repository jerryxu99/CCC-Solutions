import java.util.Scanner;

public class S12019SumGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] wins1 = new int[n];
        int[] wins2 = new int[n];

        for (int i = 0; i < n; i++ ) {
            wins1[i] = scan.nextInt();
        }
        for (int i = 0; i < n; i++ ) {
            wins2[i] = scan.nextInt();
        }

        int K = -1;
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < n; i++) {
            sum1 += wins1[i];
            sum2 += wins2[i];
            if (sum1 == sum2) {
                K = i;
            }
        }
        System.out.print(K + 1);
    }
}
