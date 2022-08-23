import java.util.Scanner;

/**
 * permutation
 */
public class permutation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, r, nPr;
        System.out.println("Enter your value of n");
        n = sc.nextInt();
        System.out.println("Enter your value of r");
        r = sc.nextInt();
        nPr = fact(n)/fact(n-r);
        System.out.println("The arragement are "+nPr);


    }

    static int fact(int a){
        
        int product = 1;
         for (int i = 1; i <= a; i++) {
            product = product*i;

         }
        return product;

    }
}