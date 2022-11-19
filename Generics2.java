
public class Generics2 {
    public static void main(String[] args) {
        Test <String> T1 = new Test<String>();
        Test <Integer> T2 = new Test<Integer>();
        T1.set("Rahul");
        T2.set(420);
        System.out.println("The name is"+ T1.get());
        System.out.println( "The  number is "+T2.get());
        
        
    }
    
}

class Test<T>
{
    T var;
    public void set(T value)
    {
        var = value;
    }
    T get()
    {
        return var;
    }
}