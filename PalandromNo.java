import java.util.Scanner;

public class PalandromNo {
    public static void main(String[] args) {
        System.out.println("Enter Number you want to reverse: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int copy = a;
        int reverse = 0;

        int reminder;
        while (a > 0) {
            reminder = a % 10;
            reverse = reverse * 10 + reminder;
            a = a /10;
            
        }
        
        System.out.println("The reverse number is:" + reverse);

       if (copy == reverse) {
            System.out.println("is a palendrom");
       } 
       else {
        System.out.println("not a palendrom");
       }
       
    }
}
