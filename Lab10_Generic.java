public class Lab10_Generic {
    public static void main(String[] args) {
        Arr <String> str = new Arr <String> ();
        Arr <Integer> num = new Arr <Integer> ();
        Arr <Double> Dob = new Arr <Double> ();
        String name[] = {"Rahul", "Ranjan"};
        Integer numb[] = {20, 21};
        Double d[] = {24.0, 21.6};
        str.take(name);
        Dob.take(d);
        num.take(numb);

        str.display(name);
        Dob.display(d);
        num.display(numb);

        
    }
}

class Arr<T>{

    public <T> void take( T arr[] )
    {
        T temp;
        temp =  arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }

    <T> void display (T arr[])
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("At index "+i+" "+arr[i]);
        }
        System.out.println("");
    }

}