import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your first no. ");
        int num1 = sc.nextInt();

        System.out.println("Enter the operator");
        char sign = sc.next().charAt(0);

        System.out.println("Enter your second no.");
        int num2 = sc.nextInt();

        switch (sign) {
            case '+': {
                System.out.println(num1 + " + " +num2 + " = " + (num1 + num2));
            }
            break;

            case '-' :{
                System.out.println(num1 + " - " +num2 + " = " + (num1-num2));
            }
            break;

            case '*' :{
                System.out.println(num1 + " X " +num2 + " = " + (num1*num2));
            }
            break;

            case '/' :{
                if(num2 == 0){
                    System.out.println(num1 + " ÷ " + num2 + " = "+"Infinite");
                }
                else {
                    System.out.println(num1 + " ÷ " + num2 + " = " + (num1 / num2));
                }
            }
            break;

            default: {
                System.out.println("wrong input! Try Again");
            }

        }
    }
}
