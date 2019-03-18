import java.util.*;

public class S12010ComputerPurchase {
    public static void main(String[] args) {
        HashMap<Integer, String> computers = new HashMap<>();
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < N; i++) {
            String[] input = scan.nextLine().split(" ");
            computers.put(2 * Integer.valueOf(input[1]) + 3 * Integer.valueOf(input[2]) + Integer.valueOf(input[3]), input[0]);
        }

        Integer[] scores = new Integer[N];
        int counter = 0;
        for (Map.Entry<Integer, String> entry : computers.entrySet()) {
            scores[counter] = entry.getKey();
            counter++;
        }

        Arrays.sort(scores, Collections.reverseOrder());

        if (scores.length == 1) {
            System.out.println(computers.get(scores[0]));
            return;
        }
        if (scores[0] == scores[1]) {
            String a = computers.get(scores[0]);
            String b = computers.get(scores[1]);
            if (a.compareTo(b) > 0) {
                System.out.println(a);
                System.out.println(b);
            } else {
                System.out.println(b);
                System.out.println(a);
            }
        }
        else {
            System.out.println(computers.get(scores[0]));
            System.out.println(computers.get(scores[1]));
        }
    }
}
