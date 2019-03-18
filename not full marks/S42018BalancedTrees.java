import java.util.HashMap;
import java.util.Scanner;

public class S42018BalancedTrees {//next time add the trees/2

    static HashMap<Integer, Long> calculatedTrees = new HashMap<>();

    public static Long calculateTrees(int weight) {
        Long trees;
        if (calculatedTrees.containsKey(weight)) {
            return calculatedTrees.get(weight);
        } else {
            trees = (long)(weight - weight/3);
        }

        for (int i = 2; i <= weight/ 3; i++) {
            trees += calculateTrees(weight / i); //calculateTrees((int)Math.floor(weight / i));
        }
        calculatedTrees.put(weight, trees);
        return trees;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        calculatedTrees.put(1, (long)1);
        calculatedTrees.put(2, (long)1);
        int weight = scan.nextInt();
        System.out.print(calculateTrees(weight));
    }
}