
package usingobjectasparameters;

class Test
{
    int a,b;
    Test(int i,int j)
    {
        a=i;
        b=j;
    }
    boolean equals(Test o)
    {
        if(o.a==a && o.b==b)
        {
            return true;
        }
        else
            
        return false;
        
    }
}

public class UsingObjectAsParameters {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Test ob1=new Test(12,2);
        Test ob2=new  Test(12,2);
        Test ob3=new Test(3,2);
        
        System.out.println("ob1==ob2: "+ob1.equals(ob2));
        System.out.println("ob1==ob3: "+ob1.equals(ob3));
    }
}
