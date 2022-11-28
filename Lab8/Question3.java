import java.util.*;
class SeatSFilledException extends Exception {
    void Display() {
        System.out.println(" sorry Seats are full! ");
    }
}

class Student {
    String name;
    int reg_no;
    short sem;
    float gpa, cgpa;
    int doj;
    static int Count = 0;
    final int finalRegistration = 3025;
    Student(String iname, int d, int m, int y, short isem, float icgpa, float igpa) {
        Count += 10;
        String tem1,tem2,tem3;
        tem1 = String.valueOf(d);
        tem2 = String.valueOf(m);
        tem3 = String.valueOf(y);
        name = iname;
        sem = isem;
        gpa = igpa;
        cgpa = igpa;
        doj = Integer.valueOf(tem1+tem2+tem3);
        String year = String.valueOf(y);
        String cnt = String.valueOf(Count);
        reg_no = Integer.valueOf(year.substring(2,3)+cnt);
    }
    void Display() throws SeatSFilledException
    {
        if(reg_no > finalRegistration){
            throw new SeatSFilledException();
        }
        else
        {
            System.out.println("Name:- "+name+"\nReg_No.:- "+reg_no+"\nDateOfJoining:-"+doj+"\nCGPA:-"+cgpa+"\nGPA:-"+gpa);
        }
    }
   
}

/**
 * Question3
 */
public class Question3 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Ener size of array");
        int n = sc.nextInt();
        
        Student[] s = new Student[n];
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.println("Enter your name");
            String name = sc.nextLine();
            System.out.println("Enter date of joining");
            int d = sc.nextInt();
            System.out.println("Enter months of joining");
            int m = sc.nextInt();
            System.out.println("Enter year of joining");
            int y = sc.nextInt();
            System.out.println("Enter Semester");
            Short sem = sc.nextShort();
            System.out.println("Enter CGPA");
            Float cgpa = sc.nextFloat();
            System.out.println("Enter GPA");
            Float gpa = sc.nextFloat();
            s[i] = new Student(name, d, m, y, sem, gpa, gpa);
        }

        for (int i = 0; i < s.length; i++) {
            try {
                System.out.print("\n\n*********************************\n\n");
                s[i].Display();
            } catch (SeatSFilledException e) {
                e.Display();
            }
        }
    }
    
    
}
