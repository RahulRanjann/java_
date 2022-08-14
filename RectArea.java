import java.util.Scanner;

class Rectangle {

    int length, width; // instance variablesw

    void getData(int x, int y) {
        length = x;
        width = y;
    }

    int rectArea() {

        int area = length * width;
        return area;
    }
}

class RectArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int area1, area2;
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle();
        rect1.length = sc.nextInt();
        rect1.width = 20;
        area1 = rect1.length * rect1.width;
        rect2.length = 15;
        rect2.width = 25;
        area2 = rect2.length * rect2.width;
        System.out.println("AREA1 =" + area1);
        System.out.println("AREA2=" + area2);
    }
}