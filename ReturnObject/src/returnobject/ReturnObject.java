
package returnobject;







class Test
{
    int a;
   

   Test(int i) {
        a = i;
    }
    
   Test increasedbtTen()
   {
       Test temp=new Test(a+10);
       
        return temp;
       
   }
    
}



public class ReturnObject {
    
    

    public static void main(String[] args) {
        
        
        Test ob1=new Test(2);
        Test ob2;
        
        ob2=ob1.increasedbtTen();
        System.out.println("ob1.a: "+ob1.a);
        System.out.println("ob2.a: "+ob2.a);
        ob2=ob2.increasedbtTen();
        System.out.println("ob2.a : "+ob2.a);
        
        
        
        
        
    }
}
