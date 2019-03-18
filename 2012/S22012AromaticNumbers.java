import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class S22012AromaticNumbers {
    public static void main(String[] args) {
        HashMap<Character, Integer> romanNums = new HashMap<>();
        romanNums.put('I', 1);
        romanNums.put('V', 5);
        romanNums.put('X', 10);
        romanNums.put('L', 50);
        romanNums.put('C', 100);
        romanNums.put('D', 500);
        romanNums.put('M', 1000);

        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> vals = new ArrayList<>();
        String input = scan.nextLine();
        char lastRoman = 'M';

        for (int i = 0; i < input.length(); i += 2) {
            vals.add(Character.getNumericValue(input.charAt(i)) * romanNums.get(input.charAt(i + 1)));
            if (romanNums.get(lastRoman) < romanNums.get(input.charAt(i + 1))) {
                vals.set(i/2 - 1, vals.get(i/2 - 1) * -1);
            }
            lastRoman = input.charAt(i + 1);
        }

        int sum = 0;

        for (int i : vals) {
            sum += i;
        }
        System.out.print(sum);


    }
}
