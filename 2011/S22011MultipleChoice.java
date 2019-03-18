import java.util.Scanner;

public class S22011MultipleChoice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.nextLine();
        String[] input = new String[N];
        int mark = 0;

        for (int i = 0; i < N; i++) {
            input[i] = scan.nextLine();
        }
        for (int i = 0; i < N; i ++) {
            if (input[i].equals(scan.nextLine())) {
                mark++;
            }
        }
        System.out.print(mark);
    }
}
