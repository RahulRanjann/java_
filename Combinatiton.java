import java.util.Scanner;

public class Combinatiton {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n, r,  nCr;
        System.out.println("Enter the value of n");
        n = sc.nextInt();
        System.out.println("Enter the value of r");
        r = sc.nextInt();
        int sub = (n-r);
        nCr = fact(n)/(fact(sub)*fact(r)); // formula of combination.
        System.out.println("The selection is "+nCr);
     

    }
    
    static int fact(int n){

        int product = 1;
        for (int i = 1; i <=n; i++) {
            product = product*i;   
        }
        return product;

    }
}
