import java.util.Scanner;

public class Palindromic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num , rem;
        int temp = 0;
        System.out.println("Enter a number to check that is Palindrom number or NOT");
        num = sc.nextInt();
        for (int i = num; i > 0 ; i= i/10) {
            rem = i % 10;
            temp = temp * 10 + rem;
        }

        if(temp == num)
        {
            System.out.println(num+" is a Palindromic number");
        }
        else
        {
            System.out.println(num+" is not a Palindromic number");
        }

    }
}
