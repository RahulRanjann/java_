import java.util.Scanner;

public class SoldiRhombus {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no. of row");
        int row = sc.nextInt();

        for (int i = 0; i <= row; i++) {
            // space
            for (int j = 0; j <= (row - i); j++) {
                System.out.print(" ");
            }
            // for Rhombus
            for (int j = 1; j <= row; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}