import java.util.*;

public class MissingNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array");
        int size = sc.nextInt();


        int arr [] = new int[size];
        System.out.println("Enter the element of Array");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int n = arr.length+1;
        System.out.println(n);
        int sumOfN = (n*(n+1))/2;
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sumOfN - sum + " is the missing in the Array");
    }
}