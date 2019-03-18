import java.util.Scanner;
public class S42011Blood {
    static int total;
    static int[] blood = new int[8];
    static int[] patients = new int[8];

    public static void calculate(int bloodIndex, int patientsIndex) {
        if (blood[bloodIndex] == 0) return;

        int difference = Math.min(blood[bloodIndex], patients[patientsIndex]);
        total += difference;
        blood[bloodIndex] -= difference;
        patients[patientsIndex] -= difference;
}

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 8; i++) {
            blood[i] = scan.nextInt();
        }
        for (int i = 0; i < 8; i++) {
            patients[i] = scan.nextInt() ;
        }
        //0: 0- ; 1:0+ ; 2:A- ; 3:A+ ; 4:B-; 5:B+ ; 6:AB- ; 7:AB+

        total = 0;

        //priority: Oneg, Opos, Aneg, Bneg, ABneg, Apos, Bpos, ABpos

        //Oneg
        calculate(0, 0);

        //Opos
        calculate(1, 1);
        calculate(0, 1);

        //Aneg
        calculate(2, 2);
        calculate(0, 2);

        //Bneg
        calculate(4, 4);
        calculate(0, 4);

        //ABneg
        calculate(6, 6);
        calculate(4, 6);
        calculate(2, 6);
        calculate(0, 6);

        //Apos
        calculate(3, 3);
        calculate(2, 3);
        calculate(1, 3);
        calculate(0, 3);

        //Bpos
        calculate(5, 5);
        calculate(4, 5);
        calculate(1, 5);
        calculate(0, 5);

        //ABpos
        calculate(7, 7);
        calculate(6, 7);
        calculate(5, 7);
        calculate(4, 7);
        calculate(3, 7);
        calculate(2, 7);
        calculate(1, 7);
        calculate(0, 7);

        System.out.println(total);






    }
}
