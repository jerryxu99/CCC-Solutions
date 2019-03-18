import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class S22015Jerseys {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int J = scan.nextInt();
        int numOfAthletes = scan.nextInt();
        scan.nextLine();
        String sizes = "OSML";//O represents no jersey
        int satisfied = 0;

        String[] jerseys = new String[J]; //index+1 corresponds to number

        for (int i = 0; i < J; i++) {
            jerseys[i] = scan.nextLine();
        }

        for (int i = 0; i < numOfAthletes; i++) {
            String[] request = scan.nextLine().split(" ");

            if (sizes.indexOf(request[0]) <= sizes.indexOf(jerseys[Integer.valueOf(request[1]) - 1])){
                satisfied++;
                jerseys[Integer.valueOf(request[1]) - 1] = "O";
            }

        }
        System.out.print(satisfied);
    }
}
