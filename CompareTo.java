import java.util.*;

public class CompareTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String letter1, letter2, copy1, copy2;
        
        System.out.println("Enter two letter to check which comes first in Dictonary order");
        letter1 = sc.next();
        copy1 = letter1.toLowerCase();

        System.out.println("Enter a another character");
        letter2 = sc.next();
        copy2 = letter2.toLowerCase();

        if (copy1.compareTo(copy2) <= 0) {
            System.out.println(letter1 + " comes first in Dictonary");
        } else {
            System.out.println(letter2 + " comes first in Dictonary order");
        }

    }
}
