import java.util.ArrayList;
import java.util.Scanner;

public class S32014GenevaConfection {
    static Scanner scan = new Scanner(System.in);
    static boolean complete;
    static int N;
    static ArrayList<Integer> branch = new ArrayList<>();
    static ArrayList<Integer> cars = new ArrayList<>();

    public static boolean calculate() {
        cars.clear();
        branch.clear();
        N = scan.nextInt();
        for (int j = 0; j < N; j++) {
            cars.add(scan.nextInt());
        }
        int target = 1;
        complete = true;

        while (target <= N) {
            if (cars.size() > 0 && cars.get(cars.size() - 1) == target) {
                cars.remove(cars.size() - 1);
                target++;
            }
            else if (branch.size() > 0 && branch.get(branch.size() - 1) == target) {
                branch.remove(branch.size() - 1);
                target++;
            }
            else if (cars.size() > 0){
                branch.add(cars.get(cars.size() - 1));
                cars.remove(cars.size() - 1);
            }
            else {
                complete = false;
                break;
            }
        }

        //check if branch is sorted
        return complete;

    }

    public static void main(String[] args) {

        int T = scan.nextInt();
        for (int i = 0; i < T; i++) {
            if (calculate()) System.out.println("Y");
            else System.out.println("N");
        }

    }
}
