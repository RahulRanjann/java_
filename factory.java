import java.util.*;
import java.io.*;
public class factory {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner sc = new Scanner(System.in);
            Pizza p = new Pizza();
            Cake c = new Cake();
            String food = sc.next();
        
            String pizza = "pizza";
            String cake = "cake";
         
            if(pizza.equals(food))
            {
                System.out.println(p.getType());
            }
            else if(cake.equals(food))
            {
                System.out.println(c.getType());
            }

    }
}


class Pizza {
   static String getType()
    {
        return "The factory returned class Pizza\nSomeone ordered Fast Food!";
    }
}

class Cake {
   static String getType()
    {
        return "The factory returned class Cake\nSomeone ordered a Dessert!";
    }
}

