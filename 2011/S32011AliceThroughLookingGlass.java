import java.util.Scanner;

public class S32011AliceThroughLookingGlass {

    public static boolean checkCrystal(int m, int x, int y) {
        int quadrantx = x / (int)Math.pow(5, m-1);
        int quadranty = y / (int)Math.pow(5, m-1);

        if (m == 1) {
            if ((quadrantx <= 3 && quadrantx >= 1 && quadranty == 0) || (quadrantx == 2 && quadranty == 1)) {
                return true;
            }
            return false;
        }



        if (quadrantx >= 1 && quadrantx <= 3 && quadranty == 0) {
            return true;
        }
        else if (quadrantx == 2 && quadranty == 1) {
            return true;
        }
        else if (((quadrantx == 1 || quadrantx == 3) && quadranty == 1) || (quadrantx == 2 && quadranty == 2)) {
            x %= Math.pow(5, m-1);
            y %= Math.pow(5, m-1);
        }
        else {
            return false;
        }
        return checkCrystal(m - 1, x, y);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        for (int i = 0; i < N; i++) {
            int m = scan.nextInt();
            int x = scan.nextInt();
            int y = scan.nextInt();

            if (checkCrystal(m, x, y)) {
                System.out.println("crystal");
            } else {
                System.out.println("empty");
            }
        }





    }
}
