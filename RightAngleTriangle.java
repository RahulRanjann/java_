import java.util.Scanner;
public class RightAngleTriangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Column no.");
        int column = sc.nextInt();
        sc.close();
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
}