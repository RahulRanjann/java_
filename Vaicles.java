import java.*;

import javax.sound.sampled.SourceDataLine;

abstract class VaeclesPart{
    abstract void wheels();
    abstract void breakk();
    abstract void accelerator();
}

class Car extends VaeclesPart{


    // @Override
    void wheels() {
        System.out.println("aa G car hai na ;-) ");
       System.out.println(" we have 4 wheels");

        
    }

    // @Override
    void breakk() {
        // TODO Auto-generated method stub
        System.out.println("car have 3 break");
    }

    // @Override
    void accelerator() {
        // TODO Auto-generated method stub
        System.out.println("250 km/s");
    }

}

class Bike extends VaeclesPart{

    // @Override
    void wheels() {
        // TODO Auto-generated method stub
        System.out.println("aa G bike hai ");
        System.out.println("only 2");
    }

    // @Override
    void breakk() {
        // TODO Auto-generated method stub
        System.out.println("G bus 2 he hai ");
    }

    // @Override
    void accelerator() {
        // TODO Auto-generated method stub
        System.out.println("180 km/s");
    }
    
}

public class Vaicles {
    public static void main(String[] args) {
        Car obj = new Car();
        obj.wheels();
        obj.accelerator();
        obj.breakk();
        System.out.println("\n");
        Bike obj1 = new Bike();
        obj1.wheels();
        obj1.accelerator();
        obj1.breakk();


    }
}
