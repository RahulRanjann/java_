import java.util.*;

public class LearningSet {

    public static void main(String[] args) {
        HashSet <Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        System.out.println(set);
        if(set.contains(2))
        {
            System.out.println("True");
        }
        
        set.remove(1);
        System.out.println(set);
        if(set.contains(6))
        {
            System.out.println(set.contains(6));
            System.out.println("NO Luck");
        
        }
        else{
            System.out.println(set.contains(6));
            
            System.out.println("nothing found");
        }


    
    }
}