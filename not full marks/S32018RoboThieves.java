import java.util.Scanner;

public class S32018RoboThieves {
    static String[][]grid;

    public static void calculateCamera(int y, int x) {
        //up
        boolean flag = true;
        for (int i = y-1; i > 0; i--) {
            switch (grid[i][x]) {
                case ".":grid[i][x] = "N"; break;
                default: flag = false; break;
            }
            if (!flag) break;
        }

        //down
        flag = true;
        for (int i = y + 1; i < grid.length; i++) {
            switch (grid[i][x]) {
                case ".":grid[i][x] = "N"; break;
                default: flag = false; break;
            }
            if (!flag) break;
        }

        //left
        flag = true;
        for (int i = x-1; i >0; i--) {
            switch (grid[y][i]) {
                case ".":grid[y][i] = "N"; break;
                default: flag = false; break;
            }
            if (!flag) break;
        }

        //right
        flag = true;
        for (int i = x+1; i <grid[1].length; i++) {
            switch (grid[y][i]) {
                case ".":grid[y][i] = "N"; break;
                default: flag = false; break;
            }
            if (!flag) break;
        }

    }

    public static void mark(int y, int x, int distance) {
        grid[y][x] = Integer.toString(distance);
        switch (grid[y+1][x]) {
            case "W": break;
            case "N": break;
            case "C": break;
            case ".": mark(y+1, x, distance+1); break;
            default:
                if (Integer.valueOf(grid[y+1][x]) > distance + 1) {
                    mark(y+1,x,distance+1);
                }
                break;
        }

        switch (grid[y-1][x]) {
            case "W": break;
            case "N": break;
            case "C": break;
            case ".": mark(y-1, x, distance+1); break;
            default:
                if (Integer.valueOf(grid[y-1][x]) > distance + 1) {
                    mark(y-1,x,distance+1);
                }
                break;
        }

        switch (grid[y][x+1]) {
            case "W": break;
            case "N": break;
            case "C": break;
            case ".": mark(y, x+1, distance+1); break;
            default:
                if (Integer.valueOf(grid[y][x+1]) > distance + 1) {
                    mark(y,x+1,distance+1);
                }
                break;
        }

        switch (grid[y][x-1]) {
            case "W": break;
            case "N": break;
            case "C": break;
            case ".": mark(y, x-1, distance+1); break;
            default:
                if (Integer.valueOf(grid[y][x-1]) > distance + 1) {
                    mark(y,x-1,distance+1);
                }
                break;
        }
    }


    public static void main(String[] args) {
        //take input
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");
        int x = Integer.valueOf(input[1]);
        int y = Integer.valueOf(input[0]);

        grid = new String[y][x];
        for (int i = 0; i < y; i++) {
            grid[i] = scan.nextLine().split("");
        }


        //Find start pos
        int[] start = new int[2]; //(y, x)
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                if (grid[i][j].equals("S")) {
                    start[0] = i;
                    start[1] = j;
                }
                else if (grid[i][j].equals("C")) {
                    calculateCamera(i, j);
                }
            }
        }

        mark(start[0], start[1], 0);

        /*for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }*/

        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                switch(grid[i][j]) {
                    case "W": break;
                    case "N": System.out.println("-1"); break;
                    case ".": System.out.println("-1"); break;
                    case "0": break;
                    case "C": break;
                    default: System.out.println(grid[i][j]);

                }
            }
        }

    }
}
