import java.util.Arrays;
import java.util.Scanner;

public class S32015Gates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int G = scan.nextInt();
        int planes = scan.nextInt();
        int plane, flag;
        boolean[] gates = new boolean[G];
        Arrays.fill(gates, true);

        int docked = 0;

        for (int i = 0; i < planes; i++) {
            flag = 0;
            plane = scan.nextInt();
            for (int j = plane - 1; j >= 0; j--) {
                if (gates[j]) {
                    docked++;
                    gates[j] = false;
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) break;
        }
        System.out.print(docked);
    }

}
