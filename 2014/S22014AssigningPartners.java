import java.util.ArrayList;
import java.util.Scanner;

public class S22014AssigningPartners {
    public static void main(String[] args) {
        //variable initialize
        Scanner scan = new Scanner(System.in);
        int N = Integer.parseInt(scan.nextLine());

        String[][] students = new String[2][N];

        students[0] = scan.nextLine().split(" ");
        students[1] = scan.nextLine().split(" ");

        ArrayList<String[]> pairs = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            for (String[] pair : pairs) {
                if (students[0][i].equals(pair[1])) {
                    if (!(students[1][i].equals(pair[0]))) {
                        System.out.print("bad");
                        return;
                    }
                }
                if (students[0][i].equals(pair[1])) {
                    if (!(students[0][i].equals(pair[1]))) {
                        System.out.print("bad");
                        return;
                    }
                }
            }
            if (students[0][i].equals(students[1][i])) {
                System.out.print("bad");
                return;
            }
            pairs.add(new String[]{students[0][i], students[1][i]});
        }
        System.out.print("good");

    }
}
