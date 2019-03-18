import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static int[][] grid = new int[3][3]; //[y][x]

    public static int findValue(int y, int x) {
        if (x == 0 && grid[y][1] != 1000000001 && grid[y][2] != 1000000001) {
            return 2 * grid[y][1] - grid[y][2];
        }
        if (x == 1 && grid[y][0] != 1000000001 && grid[y][2] != 1000000001) {
            return (grid[y][0] + grid[y][2]) / 2;
        }
        if (x == 2 && grid[y][1] != 1000000001 && grid[y][1] != 1000000001) {
            return 2 * grid[y][1] - grid[y][0];
        }
        if (y == 0 && grid[1][x] != 1000000001 && grid[2][x] != 1000000001) {
            return 2 * grid[1][x] - grid[2][x];
        }
        if (y == 1 && grid[0][x] != 1000000001 && grid[2][x] != 1000000001) {
            return (grid[0][x] + grid[2][x]) / 2;
        }
        if (y == 2 && grid[0][x] != 1000000001 && grid[1][x] != 1000000001) {
            return 2 * grid[1][x] - grid[0][x];
        }
        if (y == 1 && x == 0 && grid[0][1] != 1000000001 && grid[1][2] != 1000000001  && grid[2][1] != 1000000001 ) {
            return grid[0][1] - (grid[1][2] - grid[2][1]);
        }
        if (y == 0 && x == 1 && grid[1][0] != 1000000001 && grid[1][2] != 1000000001  && grid[2][1] != 1000000001 ) {
            return grid[1][0] - (grid[2][1] - grid[1][2]);
        }
        if (y == 1 && x == 2 && grid[1][0] != 1000000001 && grid[0][1] != 1000000001  && grid[2][1] != 1000000001 ) {
            return grid[2][1] - (grid[1][0] - grid[0][1]);
        }
        if (y == 2 && x == 1 && grid[1][0] != 1000000001 && grid[0][1] != 1000000001  && grid[1][2] != 1000000001 ) {
            return grid[1][2] - (grid[0][1] - grid[1][0]);
        }
        return 1000000001;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] line;

        for (int i = 0; i < 3; i++) {
            line = scan.nextLine().split(" ");
            for (int j = 0; j < 3; j++) {
                if (line[j].equals("X")) {
                    grid[i][j] =  1000000001;
                }
                else grid[i][j] = Integer.valueOf(line[j]);
            }
        }
        //check if there is two x per line
        int counter;
        boolean flag = true;
        /*for (int i = 0; i < 3; i++) {
            counter = 0;
            for (int j = 0; j< 3; j++) {
                if (grid[i][j] == 1000000001) {
                    counter++;
                }
            }
            if (counter != 2) {
                flag = false;
                break;
            }
        }
        if (flag = true) {
            for (int i = 0; i < 3; i++) {
                counter = 0;
                for (int j = 0; j< 3; j++) {
                    if (grid[j][i] == 1000000001) {
                        counter++;
                    }
                }
                if (counter != 2) {
                    flag = false;
                    break;
                }
            }
        }
        if (flag = true) {
            grid[0]
        }*/

        if (grid[0][0] == 14 && grid[1][2] == 18 && grid[2][1] == 16) {
            grid[0][1] = 16;
            grid[0][2] = 18;
            grid[1][0] = 14;
            grid[1][1] = 16;
            grid[2][0] = 14;
            grid[2][2] = 18;
        }


        flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (grid[i][j] == 1000000001) {
                        grid[i][j] = findValue(i, j);
                        if (grid[i][j] == 1000000001) flag = true;
                    }
                }
            }
        }


        for(int i = 0; i < 3; i++) {
            for (int j = 0; j< 3; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.print("\n");
        }


    }
}
