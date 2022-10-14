import java.util.Scanner;

public class BubbleSortt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        System.out.println("Enter the");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("array of "+i);
            arr1[i]= sc.nextInt();
        }


        System.out.println("After sorting the array ");
        //bubble sort
        for (int i = 0; i < arr1.length; i++) {
            int temp ;
         
            for (int j = 0; j < (arr1.length-1); j++) {
                
                if (arr1[j] > arr1[j+1]) {
                    temp = arr1[j];
                    arr1[j] = arr1[j+1];
                    arr1[j+1] = temp; 
                }
            }            
        }
       
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(" "+arr1[i]);
        }
    }
}
