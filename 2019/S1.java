import java.util.Scanner;

public class S1 {

    static int[][] grid = new int[2][2]; //horiz, down

    public static void vertFlip() {
        int[] top = new int[2];
        top[0] = grid[0][0];
        top[1] = grid[1][0];

        int[] bottom = new int[2];
        bottom[0] = grid[0][1];
        bottom[1] = grid[1][1];

        grid[0][0] = bottom[0];
        grid[1][0] = bottom[1];
        grid[0][1] = top[0];
        grid[1][1] = top[1];
    }

    public static void horizFlip() {
        int[] left = new int[2];
        left[0] = grid[0][0];
        left[1] = grid[0][1];

        int[] right = new int[2];
        right[0] = grid[1][0];
        right[1] = grid[1][1];

        grid[0][0] = right[0];
        grid[0][1] = right[1];
        grid[1][0] = left[0];
        grid[1][1] = left[1];
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        grid[0][0] = 1;
        grid[1][0] = 2;
        grid[0][1] = 3;
        grid[1][1] = 4;
        String[] input = scan.nextLine().split("");

        for (int i = 0; i < input.length; i++) {
            if (input[i].equalsIgnoreCase("H")) {
                vertFlip();
            } else if(input[i].equalsIgnoreCase("V")) {
                horizFlip();
            }
        }

        System.out.println(grid[0][0] + " " + grid[1][0] + "\n" + grid[0][1] + " " + grid[1][1]);
    }
}
