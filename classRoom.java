
import java.util.Scanner;

public class classRoom {
    static public void main(String[] args) {
        try (// write your code here
                Scanner scan = new Scanner(System.in)) {
        }
        display dis = new display();
        dis.function();

    }

}

class display {

    void function() {
        Zoo A = new Zoo();
        A.Dog();
    }
}

class Zoo {

    Scanner sc = new Scanner(System.in);

    void Dog() {
        System.out.println("What is my name(pet name)");
        String name = sc.nextLine();
        System.out.println("How old i'm?");
        int age = sc.nextInt();
        System.out.println("you entered Name:- "+name+"\n"+"Age:- "+age);

    }

    void lion() {
        System.out.println("What is my name(pet name)");
        String name = sc.nextLine();
        System.out.println("How old i'm ?");
        int age = sc.nextInt();
        System.out.println("you entered Name:- "+name+"\n"+"Age:- "+age);
        sc.close();
    }

    void owner() {
        System.out.println("What is your name");
        String name = sc.nextLine();
        System.out.println("how old are you?");
        int age = sc.nextInt();
        System.out.println("you entered Name:- "+name+"\n"+"Age:- "+age);
        sc.close();
    }
}
