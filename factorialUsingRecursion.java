import java.util.Scanner;

public class factorialUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rec obj = new Rec();
        System.out.println("Ente a no. to print factorial");
        int num  = sc.nextInt();
        int fact = obj.fun(num);
        System.out.println("The factorial of "+num+" is "+fact);

    }
}

class Rec{
    int fun(int n)
    {
        if(n > 1)
        {
            return n * fun(n-1);
        }
        else{
            return n;
        }
        
    }
}
