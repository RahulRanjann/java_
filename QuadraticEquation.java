import java.util.*;
import java.util.regex.MatchResult;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println(" Ente the cofficients of equation");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        root(a, b, c);
    }
    static void root(int a, int b, int c)
    {
        int d ;
        double x, y;
        d = (b*b)-(4*a*c);

        int flag = 0 ;
        if (d > 0) // if the d > 0 then the quadratic function has two distinct real roots. 
        { 
            flag = 1;
        } 
        else if(d == 0) // if the d == 0 then the quadratic function has one repeated real root.
        { 
            flag = 0;
        }
        else if(d < 0) // if the d < 0 then the quadratic fucntion has no real roots 
        {
            flag = -1;
        }

        switch (flag) {
            case 1:
                x = (-1*b + Math.sqrt(d))/(2*a);
                y = (-1*b - Math.sqrt(d))/(2*a);
                System.out.println("The root are real and distinct \n x = "+x +"\n y ="+y);
                break;

            case 0:
                x = (-1*b)/(2*a);
                System.out.println("The root are real and equal is "+x);
                break;

            case -1:
                x = ((-1*b)+Math.sqrt(d))/(2*a);
                y = ((-1*b)-Math.sqrt(d))/(2*a); 
                System.out.println("The root are Imaginary and distinct \n x = "+x +"\n y ="+y);
                break;
        }

    }
}


