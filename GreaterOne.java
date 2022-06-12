import java.util.Scanner;

public class GreaterOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;
        System.out.println("Enter your first no.");
        num1 = sc.nextInt();
        System.out.println("Enter your second no.");
        num2 = sc.nextInt();
        System.out.println("Enter your third no.");
        num3 = sc.nextInt();

        if (num1 >= num2 && num1 >= num3) {
            System.out.println(num1 + " is greater among these");
        } else if (num2 >= num3 && num2 >= num1) {
            System.out.println(num2 + " is greater among these");
        } else if (num3 >= num1 && num3 >= num2) {
            System.out.println(num3 + " is greater among these");
        }

    }
}
