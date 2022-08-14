class Rectangle1{
    int length, width;
    Rectangle1(int x, int y){        //parameterized Constructor
        length = x;
        width = y;
    }
    int rectArea(){
        return (length * width);
    }
    
}

public class Area {
    public static void main(String[] args) {

        Rectangle1 rect1 = new Rectangle1(15,10);
        int area = rect1.rectArea();
        System.out.println("Area "+area);
        System.out.println("");
    }
}
