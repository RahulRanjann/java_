import java.util.Scanner;
public class Quesion2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);  
       
        CreateDate d = new CreateDate();
        try {
            d.Create_Date();
        } catch (dayErr e) {
            
            e.Err();
        }
        catch (MonthErr e) {
            
            e.Err();
        }
       d.display();

    }
}

class dayErr extends Exception
{
    public void Err() {
        System.out.println("dayError found");
    }
}

class MonthErr extends Exception
{
    public void Err() {
        System.out.println("Months Error found");
    }
}




class CreateDate{
    Scanner sc = new Scanner(System.in);
    int day;
    int months;
    int year;
   void Create_Date () throws dayErr,MonthErr
    {
        System.out.println("Enter a day");
        this.day =sc.nextInt();
       
        if(!(day>0 && day<32) ){
            throw new dayErr();
        }

        System.out.println("Enter a month");
        this.months =sc.nextInt();

        if(!(months>0 &&  months<13))
        {
            throw new MonthErr();
        }

        System.out.println("Enter a year");
        this.year = sc.nextInt();
        
    }
    void display()
    {
        if(year != 0)
        {
            System.err.println("The date is :-"+this.day+"/"+this.months+"/"+this.year);
        }
        else
        {
            System.out.println("Envalid date");
        }
    }
}