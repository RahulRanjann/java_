public class PyramidTriangle {
    public static void main(String[] args) {
        int iter = 6;
        for (int i = 1; i <= iter; i++) {

            for (int j = 1; j <= iter-i; j++) {
                System.out.print(" ");
            }
            
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j < i  ; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
