import java.util.Scanner;

/**
 * ReverceString
 */
public class ReverceString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name ;
        String name2 = "";
        System.out.println("Enter your name");
        name = sc.nextLine();
        for (int i = name.length()-1; i >= 0; i--) {
            name2 = name2+ name.charAt(i);
        }
        System.out.println(name2);

    }
}