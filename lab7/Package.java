package mypackage.p1; // this will creat a folder named mypackage and inside mypackage folder will create p1 foldre and now when we'll compile {javac -q . package.java} the class file will created inside of the Package class
public class Package {
    public static int max(int a, int b, int c) {
        
        if (a>b && a>c) {
            return a;           
        }
        else if (b>a && b>c) {
            return b;
        }
        else {
            return c;
        }
      
    }
    public static float max(float a, float b, float c){
        if (a>b && a>c) {
            return a;           
        }
        else if (b>a && b>c) {
            return b;
        }
        else {
            return c;
        }
    }    
        public static int max(int []a) {
            int m = a[0];
            for (int i = 0; i < a.length; i++)
            {
                if(a[i] > m)
                {
                    m = a[i];
                }
            }
            return m;
        } 

        public static int max( int [][]a, int row, int column){
            
            int m= a[0][0];
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column ; j++) {
                    if(a[i][j]> m)
                    {

                    }
                    m = a[i][j];
                }
            }
            return m;

        }

            
        
    }
    

