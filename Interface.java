public class Interface {
    public static void main(String[] args) {
        
        
    }
}

interface  Test{
    void drink ();
    void eat();
}

class man implements Test {

    @Override
    public void drink() {
       System.out.println("i'm drinking");
        
    }

    @Override
    public void eat() {
       System.out.println("i'm eating");
        
    }

}