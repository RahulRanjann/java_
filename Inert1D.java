import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

/**
 * Inert1D
 */
public class Inert1D {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n = sc.nextInt();
        int arr[] = new int [n];
        System.out.println("Ente the values of array");
        for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();
            
        }
        System.out.println("choose one of thes insert or delete data from the array");
        String key = sc.nextLine();
        int flage = 0;
        
        switch (key) {
            // int flage;
            case "delete":
            System.out.println("Enter a number to delet the data from the array");
            int find = sc.nextInt();
            for (int i = 0; i < arr.length; i++) 
            {
                if (find == arr[i]) 
                {
                    
                }
                               
            }
            if (flage != 0) 
                {
                    System.out.println("Data deleted succesfuly");
                } else 
                {
                    System.out.println("Data not found");
                }
                break;
        
            default:
                break;
        }
    }
}