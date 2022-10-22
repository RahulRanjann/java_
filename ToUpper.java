import java.util.*;
public class ToUpper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String UppName = name.substring(0, 1).toUpperCase()+name.substring(1, name.length());
        System.out.println(UppName);
    }
}
