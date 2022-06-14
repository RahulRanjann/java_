import java.util.Scanner;

public class FloydTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // System.out.println("Enter the a number");
        // int num = sc.nextInt();
        int num = 1;

        for (int i = 0; i <= 4; i++) {
            
           for (int j = 0; j <= i; j++) {
            System.out.print(num+" ");
            num++;
           } 
            System.out.println();
        }

        sc.close();
    }
}
