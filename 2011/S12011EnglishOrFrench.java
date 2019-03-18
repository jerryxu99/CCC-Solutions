import java.util.Scanner;

public class S12011EnglishOrFrench {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.nextLine();
        int t = 0;
        int s = 0;

        for (int i = 0; i < N; i++) {
            String[] line = scan.nextLine().split("");
            for (int j = 0; j < line.length - 1; j++) {
                if (line[j].equalsIgnoreCase("t")) {
                    t++;
                } else if (line[j].equalsIgnoreCase("s")) {
                    s++;
                }
            }
        }
        if (t > s) {
            System.out.println("English");
        }
        else {
            System.out.println("French");
        }
    }
}
