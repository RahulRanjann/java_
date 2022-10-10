import java.util.Scanner;

import javafx.print.PageLayout;

public class PigLatin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you name");
        String name = sc.nextLine();
        String pigLatin = "";
        int count = 0;
        char last = name.charAt(0);
        for (int i = 1; i <= 4; i++) {
            pigLatin = pigLatin + name.charAt(i);
            count++;
        }
        pigLatin += last;
        System.out.println(pigLatin.toUpperCase() + "ay");
    }
}
