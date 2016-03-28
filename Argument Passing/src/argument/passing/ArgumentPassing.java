
package argument.passing;

class  Test
{
    void method(int i,int j)
    {
        i*=2;
        j/=2;
    }
}

public class ArgumentPassing {

    public static void main(String[] args) {
        
        Test ob=new Test();
        int a=10;
        int b=20;
        System.out.println("a and b before call : "+a+" "+b);
        ob.method(a, b);
        System.out.println("an and  b after call : "+a+" "+b);
        
        
    }
}
