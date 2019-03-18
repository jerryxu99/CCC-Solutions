import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class S32019AbsolutelyAcidic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] frequencies = new int[1001];

        Arrays.fill(frequencies, 0);
        for (int i = 0; i < N; i++) {
            frequencies[scan.nextInt()]++;
        }

        int maxFrequency = 0;
        ArrayList<Integer> mostFrequent = new ArrayList();

        for (int i = 0; i < 1001; i++) {
            if (frequencies[i] > maxFrequency) {
                maxFrequency = frequencies[i];
                mostFrequent.clear();
                mostFrequent.add(i);
            }
            else if (frequencies[i] == maxFrequency) {
                mostFrequent.add(i);
            }
        }

        if (mostFrequent.size() > 1) {
            int largest = mostFrequent.get(0);
            int smallest = mostFrequent.get(0);
            for (int i = 0; i < mostFrequent.size(); i++) {
                if (mostFrequent.get(i) > largest) largest = mostFrequent.get(i);
                if (mostFrequent.get(i) < smallest) smallest = mostFrequent.get(i);
            }
            System.out.print(largest - smallest);
            return;
        }

        int mostFrequentnum = mostFrequent.get(0);
        int secondMaxFrequency = 0;
        mostFrequent.clear();

        for (int i = 0; i < 1001; i++) {
            if (frequencies[i] == maxFrequency) continue;
            if (frequencies[i] > secondMaxFrequency) {
                secondMaxFrequency = frequencies[i];
                mostFrequent.clear();
                mostFrequent.add(i);
            }
            else if(frequencies[i] == secondMaxFrequency) {
                mostFrequent.add(i);
            }
        }
        int largest = mostFrequent.get(0);
        int smallest = mostFrequent.get(0);
        for (int i = 0; i < mostFrequent.size(); i++) {
            if (mostFrequent.get(i) > largest) largest = mostFrequent.get(i);
            if (mostFrequent.get(i) < smallest) smallest = mostFrequent.get(i);
        }
        System.out.print(Math.max(Math.abs(mostFrequentnum - largest), Math.abs(mostFrequentnum - smallest)));

    }
}
