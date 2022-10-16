import java.util.Scanner;

/**
 * Reverse_string
 */
public class Reverse_string {

    public static void main(String[] args) {

        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String a = A.toLowerCase();
        /* Enter your code here. Print output to STDOUT. */
        String newA ="";
        for (int i = A.length()-1; i >=0 ; i--) {
            newA= newA+a.charAt(i);
        }
        if(a.equals(newA))
        {
            System.out.println("Yes");
        }
    }
}
