import java.io.*;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class UserDefingException {
    public static void main(String[] args) throws MyException 
    {
        int age = 19;

        // if(age<18)
        // {
        //     throw new MyException("ye to tera Error hia ...........!");
        // }
        // else
        // {
        //     System.out.println("you can vote now .............! ");
        // }


        // both are cheked exception


            try {
            if(age<18)
            {
                throw new MyException();
            }
            else
            {
                System.out.println("you can vote @@@@");
            }
        } 
        catch (MyException e) {
           System.err.println(e);
        }
            

    }
}
