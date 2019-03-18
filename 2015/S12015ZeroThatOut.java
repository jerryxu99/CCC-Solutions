import java.util.ArrayList;
import java.util.Scanner;

public class S12015ZeroThatOut {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int current;
        int sum = 0;
        int K = scan.nextInt();
        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 0; i < K; i++) {
            current = scan.nextInt();
            if (current == 0) {
                nums.remove(nums.size() - 1);
            } else
                nums.add(current);
        }
        for (int num : nums) {
            sum += num;
        }
        System.out.print(sum);
    }
}
