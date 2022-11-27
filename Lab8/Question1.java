public class Question1 {
    public static void main(String[] args) {
        Stack s = new Stack(2);
        try {
            s.push(5);
            s.push(10);
            s.display();
            s.push(15);
        } catch (OverflowErr e) {   
            System.out.println(e);
        }

        try {
            s.pop();
            s.pop();
            s.display();
            s.pop();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}


class OverflowErr extends Exception
{
        void display()
    {
        System.out.println("Stack Overflow");
    }
}

class UnderFlowErr extends Exception
{
    void display()
    {
        System.out.println("stack underflow");
    }
}

class Stack{
    int stc[];
    int size;
    int top;
    Stack(int size)
    {
        stc = new int[size];
        this.size = size;
        top= -1;
    }

    void push(int value)throws OverflowErr
    {
        if(top == size-1)
        {
            throw new OverflowErr();
        }
        else
        {
            stc[++top] = value;
        }
    }

    int pop()throws UnderFlowErr
    {
        if(top == -1)
        {
            throw new UnderFlowErr();
        }
        else
        {
            return stc[top--];

        }
    }

    void display()
    {
        for (int i = 0; i < stc.length; i++) {
            System.out.println(stc[i]+" ");
        }
    }


}

