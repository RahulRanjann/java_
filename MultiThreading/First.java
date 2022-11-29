package MultiThreading;

import javax.swing.plaf.metal.MetalIconFactory.FolderIcon16;

public class First {
    // public static void main(String[] args) throws Exception {
    //     for (int i = 0; i <=5; i++) {
    //         Thread.sleep(1000);
    //         System.out.println(i);
    //     }
    // }


    // another way 

    public static void main(String[] args) {
        try {
            for (int i = 0; i <=5; i++) {
                Thread.sleep(1000);
                System.out.println(i);
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}
