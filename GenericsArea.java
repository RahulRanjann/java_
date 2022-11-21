import java.math.*;
public class GenericsArea {
    public static void main(String[] args) {
        Area <Integer> a1 = new Area<Integer>();
        a1.get(5);
        a1.circle();
        a1.rectangle();
        a1.square();
    }
}

class Area<T>{
final Double  pi = 3.14;
    private T t;

     void get(T side)
    {
        this.t = side;
    }

    void circle()
    {
        System.out.println("Area of circle "+ t );
    }

    void rectangle()
    { int a =(Integer) t;
        System.out.println("Area of rectangle "+ Math.pow(2, a));
    }

    void square()
    {
        int a =(Integer) t;
        System.out.println("Area of Square "+ a*a);
    }
}

