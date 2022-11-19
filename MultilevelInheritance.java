public class MultilevelInheritance {
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.miss();
        p.eat();
        p.bark();
    }
}

class Animal {
    void eat()
    {
        System.out.println("Eating.................");
    }
}

class Dog extends Animal{
    void bark()
    {
        System.out.println("i'm barking ");
    }
}

class Puppy  extends Dog{
    void miss()
    {
        System.out.println("i'm missing Dog");
    }
}