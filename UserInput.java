import java.util.Scanner;


// to clear buffer in java we should use sc.nexline() after int, long, double and float or we can also write sc = new Scanner(System.in);
class Person{
    String name;
    int age;
    long phone;
    Scanner sc = new Scanner(System.in);
    Person(String n,int a,long p){
         name = n;
         age = a;
         phone = p;


    }
    void display()
    {
        System.out.println("your name is : "+name);
        System.out.println("your age is : "+age);
        System.out.println("your phone number is : "+phone);
    }
    
    
    void change (){
        
        System.out.println("enter your new  name : ");
        sc = new Scanner(System.in);
        String n1=sc.nextLine();
        this.name=n1;
        System.out.println("enter you new age: ");
        sc = new Scanner(System.in);
        int a1=sc.nextInt();
        this.age=a1;
        System.out.println("your new phone number : ");
        sc = new Scanner(System.in);
        long p1=sc.nextLong();
        this.phone=p1;
        
    }
    void reset(){
        name=null;
        age=0;
        phone=0L;
    }
}

class UserInput{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter your name");
        sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Enter you age");
        sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println("Enter your phone");
        sc = new Scanner(System.in);
        long phone = sc.nextLong();
        
        
        Person k = new Person(name, age, phone);
        char choice;
        
        while(true)
        {
            System.out.println("do you want to submit the details (y/n)");
            choice=sc.next().charAt(0);
            sc.nextLine();

            if(choice=='n')
            {
                k.reset();
                k.change();
                k.display();
                
            }
            else if(choice =='y') 
            {
                k.display();
                break;
                
            }
        }
        
        
        
    }
}