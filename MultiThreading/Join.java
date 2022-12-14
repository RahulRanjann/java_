package MultiThreading;

import javax.swing.plaf.metal.MetalIconFactory.FolderIcon16;

class MyThread extends Thread
{
    public void run()
    {
        for (int i = 0; i < 10; i++) {
            try {
                System.err.println(i);
                Thread.sleep(1000);
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println(e);
            }
        }
    }
}

class MyThread2 extends Thread
{
    public void run()
    {
        for (int i = 0; i < 10; i++) {
            try {
                System.err.println(i);
                Thread.sleep(1000);
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println(e);
            }
        }
    }
}

public class Join {
    public static void main(String[] args)throws Exception {
        MyThread t1 =new MyThread();
        t1.start();
        //The join will wait for when the first thread will finish and the second will join
        t1.join();
        MyThread2 t2 =new MyThread2();
        t2.start();
       // String
       Integer

    }
}
