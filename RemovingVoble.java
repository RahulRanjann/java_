import java.util.Scanner;

public class RemovingVoble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name in lower case");

        String string = sc.nextLine();
        int mux = string.length() - 1;
        System.out.println(string);
        System.out.println("your name after removing vowels :-");
        sc.close();
        for (int i = 0; i <= mux; i++) {

            if (string.charAt(i) != 'a' && string.charAt(i) != 'e' && string.charAt(i) != 'i' && string.charAt(i) != 'o'
                    && string.charAt(i) != 'u' && string.charAt(i) != 'A' && string.charAt(i) != 'E'
                    && string.charAt(i) != 'I' && string.charAt(i) != 'O' && string.charAt(i) != 'U') {
                System.out.print(string.charAt(i));
            }

        }
    }
}
