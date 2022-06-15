import java.util.Scanner;

public class HollowRectangle {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
            System.out.println("Enter the no. of column");
            int column = sc.nextInt();
            System.out.println("Enter the no. of row");
            int row = sc.nextInt();
            System.out.println("OUTPUT:-");
            for (int i = 1; i <= column; i++) {
                for (int j = 1; j <= row; j++) {
                    if (i == 1 || j == 1 || i == row || j == column) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
        }
        sc.close();
    }
    }


