class Rectangle{
    int length, width;
    Rectangle(int x, int y){        //parameterized Constructor
        length = x;
        width = y;
    }
    int rectArea(){
        return (length * width);
    }

}

public class Area {
    public static void main(String[] args) {

        Rectangle rect1 = new Rectangle(15,10);
        int area = rect1.rectArea();
        System.out.println("Area "+area);
    }
}
