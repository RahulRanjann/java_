

public class Generics1 {
    public static void main(String[] args) {
        Example G = new Example();

        String name[] =  {"Rahul", "Ranjan","Raman","kuber","Lamba"};
        Integer num[] = {10,20,30,40,50};   
        G.display(num);
        G.display(name);
   
    }
}

 class Example
{
    public <E> void display(E []n)
    {
        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i]);
        }
    }


}