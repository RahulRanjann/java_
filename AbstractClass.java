class AbstractClass{
    public static void main(String[] args) {
        Human hm = new Human();
        hm.drink();
        hm.eat();
    }
}

abstract class Test{
    abstract void eat();
    void drink()
    {
        System.out.println("i'm drinking");
    }
}

class Human extends Test{

    @Override
    void eat() {
        System.out.println("i'm eating");   
    }

}