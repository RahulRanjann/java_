import java.util.*;

public class SumOf_n_NaturalNo {

    static int sum(int n)
    {
       if(n>0)
       {
        return n+ sum(n-1);
       }
       else{
        return 0;
       }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to get sum of natural number till that no.");
        int add = sc .nextInt();
        System.out.println("The sum of is "+sum(add));
    }
}
