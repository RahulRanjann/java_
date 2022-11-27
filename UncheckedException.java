public class UncheckedException extends RuntimeException {
    public UncheckedException(String e)
    {
        super(e);
    }
    
    public UncheckedException()
    {
        super("!.....ye to UnChecked Exception hai.....!");
    }
}
