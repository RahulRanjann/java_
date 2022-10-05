import java.util.Scanner;

public class SumOfNnumberUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sum add = new Sum();
        System.out.println("Enter a number to add 1 to till where you want ");
        int num = sc.nextInt();
        int c = add.fun(num);
        System.out.println("The sum of the num is "+ c);
    }
}
class Sum{
    int fun(int n)
    {
        if(n>0){
            return n + fun(n-1);
        }
        else{
        return 0;
        }
    }
}

