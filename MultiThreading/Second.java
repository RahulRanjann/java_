package MultiThreading;
// CREATING a new thread

class MyThread extends Thread{
    public void run()
    {
        try {
            for (int i = 0; i <= 10; i++) {
                Thread.sleep(1000);
                System.out.println(i);
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}
public class Second {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }
}
