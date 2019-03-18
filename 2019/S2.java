import java.util.Scanner;

public class S2 {

    public static boolean isPrime(int n) {
        for (int i = 2; i < Math.sqrt(n) + 1; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        int n, top, bottom;

        for (int i = 0; i < T; i++) {
            n = scan.nextInt();
            top = 2 * n - 3;
            bottom = 3;
            while (!isPrime(bottom) || !isPrime(top)) {
                top -= 2;
                bottom += 2;
            }
            System.out.println(bottom + " " + top);
        }
    }
}
