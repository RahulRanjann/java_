import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter a year to check it is leap year or not");
            int year = sc.nextInt();

            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println("this is a leap Year");
                    } else {
                        System.out.println("this is not a leap year");
                    }
                } else {
                    System.out.println("this is a leap year ");
                }

            } else {
                System.out.println(" this is not a leap year ");
            }
            sc.close();
        }
    }

