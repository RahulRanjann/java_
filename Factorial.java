import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entr a number which you want factorial of");
        int num = sc.nextInt();
        System.out.println( "The factorial of "+"num is "+fact(num));
    }

    static int fact(int f){
            int product = 1;
        for (int i = 1; i <= f; i++) {
            product = product*i;
        }
        return product;
    }
}
