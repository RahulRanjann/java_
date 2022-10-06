import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, rem, temp = 0;
        System.out.println("Enter a number to reverse the no.");
        num = sc.nextInt();
        while (num != 0) {
            rem = num%10;
            temp = temp * 10 + rem;
            num = num/10;
        }        
        System.out.println(temp);
    }
}
