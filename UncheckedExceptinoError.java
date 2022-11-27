import javax.swing.plaf.synth.SynthOptionPaneUI;

public class UncheckedExceptinoError {
    public static void main(String[] args) {
        int age = 17;
        try {
            if(age <= 17)
            {
                throw new UncheckedException("ye kya ho gaya");
            }
            else
            {
                System.out.println("You can vote.........");
            }

        } catch (UncheckedException e) {
            System.err.println(e);
        }
        System.out.println("working");;
    }
}
