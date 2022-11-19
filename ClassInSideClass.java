import java.util.Scanner;

 class OuterClass{
    int num1, num2;
     void input()
     {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no.");
        a = sc.nextInt();
        System.out.println("Enter a another no.");
        b = sc.nextInt();
        this.num1 = a;
        this.num2 = b;
    }
    class innerClass{
        void display()
        {
            System.out.println("The sum of the two no. is "+ (num1+num2));
        }
    }
 }




public class ClassInSideClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OuterClass o = new OuterClass();
        OuterClass.innerClass in = o.new innerClass();
        o.input();
        in.display();
    }
}