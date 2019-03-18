import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class S4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int visitsPerDay = scan.nextInt();
        ArrayList<Integer> scores = new ArrayList<>();
        int sum= 0;

        for (int i = 0; i < N; i++) {
            scores.add(scan.nextInt());
        }
        int first, second;


        first = N % visitsPerDay;
        second = visitsPerDay;
        while (first <= visitsPerDay) {
            int valFirst = 0;
            int valSecond = 0;

            for (int i = 0; i < first; i++) {
                valFirst = Math.max(valFirst, scores.get(i));
            }
            for (int i = first; i < first + second; i++) {
                valSecond = Math.max(valSecond, scores.get(i));
            }

            if (valFirst + valSecond > sum) sum = valFirst + valSecond;
            first++;
            second--;
        }

        System.out.print(sum);










        /*if (N%visitsPerDay != 0) {
            sum += scores.pop();
        }

        for (int i = 0; i < N/visitsPerDay; i++) {
            sum += scores.pop();
        }

        System.out.println(sum);*/
    }
}
