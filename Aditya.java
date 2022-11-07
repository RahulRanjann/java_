import java.util.Scanner;

public class Aditya {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = input.nextLine();
        System.out.println("how many time you want to print your name ");
        int n = input.nextInt();
        input.close();
        while(n>0)
        {
            System.out.println(name);
            n--;
        }
    }
}

