import java.util.Scanner;

public class Aditya {
    public static void main(String[] args) {       
        
            
        System.out.println("Enter size of loop");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for (int i = 0; i <= n; i++) {
            int count = 1;
                for (int j = 0; j <= n; j++) {
                    System.out.print(j);
                }
                System.out.println();
                count ++;
        }
    }
}


