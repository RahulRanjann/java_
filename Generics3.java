public class Generics3 {
    public static void main(String[] args) {
        Integer []money = {100,200,300,400,500};
        Double []moneyD = {100.25,200.25,300.25,400.25, 500.25};
        depositive(money);
        depositive(moneyD);
    }

    static <T> void depositive(T []money)
    {
        System.out.println("Your money are :-");

        for (T t : money) {
            System.out.println(t);
        }
    }
}
