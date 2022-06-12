
import java.util.Scanner;
        class Bank{
            Scanner sc= new Scanner(System.in);
            int age , balance , amount ,deposit ;
            String name,address,job;
            Bank()
            {
                System.out.println("Enter your name");
                name = sc.nextLine();
                System.out.println("Enter your age");
                age = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter your address");
                address = sc.nextLine();
                System.out.println("Enter your Occupation name");
                job= sc.nextLine();
            }
            void details()
            {
                System.out.println();
                System.out.println("-:Account holder Details :-");
                System.out.println("NAME :-"+ name);
                System.out.println("AGE :-"+ age);
                System.out.println("Address :-"+address);
                System.out.println("Occupation :-"+job);
            }
            void  currentBalance()
            {

                System.out.println("your current balance is "+balance);
            }
            void withdraw()
            {
                System.out.println("Enter the amount to withdraw");
                amount = sc.nextInt();
                if ( balance < amount )
                {
                    System.out.println("you are out of your aukaad");
                }
                else
                {
                    System.out.println("\t-:Withdraw successfully:-"+"\nyour current balance is "+(balance=balance-amount));
                }

            }
            void Deposit()
            {
                System.out.println("Enter the amount to deposit");
                deposit = sc.nextInt();
                balance = balance+deposit;
                System.out.println("your current balance is "+(balance));

            }

        }

        public class Atm {
            public static void main(String[] args)
            {
                Scanner sc= new Scanner(System.in);

                System.out.println("Welcome to Bank of RBI({<>}) ");
                System.out.println("Enter the details");
                Bank b =new Bank();

                System.out.println("Choose your Options");
                System.out.println("your options are :-");
                System.out.println("1. Display  details.");
                System.out.println("2. Check his current balance.");
                System.out.println("3. Withdraw from current balance.");
                System.out.println("4. Deposit into current balance.");
                System.out.println("5. Exit");
                System.out.println("Choose your options from the above");
                int  s= sc.nextInt();

                while (s!=5 ) {
                    switch (s) {

                        case 1: {
                            b.details();
                        }
                        break;

                        case 2: {
                            b.currentBalance();
                        }
                        break;

                        case 3: {
                            b.withdraw();
                        }
                        break;
                        case 4: {
                            b.Deposit();

                        }
                        break;
                    }
                    System.out.println("Choose the options from above");
                    s= sc.nextInt();
                }
            }
        }
