

public class TestAbstraction {
    public static void main(String[] args) {


        Shape s = new Circle();
        Shape s1 = new Rectangle();

        s.area(14,3);
        s1.area(12, 7);

    }
}

abstract class Shape{

    abstract void area(int a , int b);
}

class Rectangle extends Shape{
    void area(int a , int b)
    {
        System.err.println("The area of  the Rectangle is "+a*b);
    }
}

class Circle extends Shape{
    int pi = 3;
    void area(int a,int pi)
    {
        this.pi = pi;
        System.err.println("The area of circle is "+ pi*a);
    }
}