import java.util.Random;

public class ExceptionHandeling1 {
    public static void main(String args[]) {
        int a = 0, b = 0, c = 0;
        Random r = new Random();
        for (int i = 0; i < 1000; i++) {
            try {
                b = r.nextInt();
                c = r.nextInt();
                System.out.println("b:" + b + "\nc: " + c);
                a = 12345 / (b / c);
                System.out.println("a: " + a);
            }
            
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println(e);
            } 
            
            catch (ArithmeticException e) {
                System.out.println("Division by zero.");
                a = 0; // set a to zero and continue
            }
            System.out.println("a: " + a);
        }
    }
}
