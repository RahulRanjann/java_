import java.util.Scanner;
public class WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input;

        do {
            System.out.println("Enter your marks _:-");
            int marks = sc.nextInt();

            if (marks >= 90 && marks <= 100)
            {
                System.out.println("your marks is great");
            }
            else if (marks >= 60 && marks <=90)
            {
                System.out.println("your marks is good");
            }
            else if (marks >= 50 && marks <= 60)
            {
                System.out.println("your marks is average");
            }
            else if (marks >= 0 && marks <= 50)
            {
                System.out.println("your marks is not so good");
            }
             else {
                System.out.println("Wrong Input!");
            }
            System.out.println("want continue then press|1| and no for |0|");
            input = sc.nextInt();
        }
        while (input == 1);

    }
}
