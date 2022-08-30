import java.util.Scanner;

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
        System.out.println("choose one of these insert or delete data from the array");
        sc.nextLine();
        String key = sc.nextLine();
        
        int flage = 0;
        
        switch (key) {
            // int flage;
            case "delete":
            System.out.println("Enter a number to \" Delete\" the data from the array");
            int data = sc.nextInt();
            for (int i = 0; i < n; i++) 
            {
                if (data == arr[i]) 
                {
                    flage = 1;
                    for(int j= i;j < n-1; j++)
                    {
                        arr[j] = arr[j+1];
                        n--;

                    }
                    break; 
                }
                                              
            }
            if (flage != 0) 
                {
                    System.out.println("Data deleted succesfuly");
                } else 
                {
                    System.out.println("Data not found");
                }

                for (int i = 0; i < n; i++) {
                    System.out.println(arr[i]);
                }

                break;

                case "insert":
        
            default:
                break;
        }
    }
}