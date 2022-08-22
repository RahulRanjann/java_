import java.util.Scanner;

public class Prime {

    static void isPrime(int p){
          int flag = 0;
        for (int i = 2; i <= (p-1); i++) {
            if (p % i == 0) {
                flag = 1;
            }
        }
        if (flag > 0) {
           System.out.println(p+" is not prime number"); 
        }
        else
            System.out.println(p+" is prime number");
        
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check that is prime or not");
        int num = sc.nextInt();
        isPrime(num);
        
      
    }
}
