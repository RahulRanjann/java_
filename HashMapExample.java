import java.util.*;

public class HashMapExample {

    public static void main(String[] args) {
    //     int arr[] = {2,0,1,5,8,6};
    //     int target = 9;
    //     HashMap<Integer, Integer> var = new HashMap<>();
    //     for (int i = 0; i < arr.length; i++) {
    //         var.put(i, arr[i]);
    //     }
    //     System.out.println();
    //     for (int i = 0; i <var.size(); i++) {
    //         if (var.containsValue(target-arr[i])) {
    //             System.out.println(i);                
    //         }
    //     }
    
    // }
        
        
        int[] arr = {2, 0, 1, 5, 8, 7};
        int target = 9;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];

            if (map.containsKey(complement)) {

                System.out.println("Index: " + map.get(complement) + ", " + i);
            }

            map.put(arr[i], i);
        }
    }

}
