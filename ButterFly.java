import java.util.Scanner;

public class ButterFly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Length of butterFly's Wings?");
        int length = sc.nextInt();
        
        for (int i = 1; i <= length; i++) {
            // for first half triangle
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // for spaces
            for (int j = 1; j <= (2*(length-1)); j++) {
                System.out.print(" ");                

            }
            //for second half triangle
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        sc.close();
    }
}
