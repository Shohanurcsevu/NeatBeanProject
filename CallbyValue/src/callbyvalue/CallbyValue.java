
package callbyvalue;

public class CallbyValue {

  class Test
  {
      int a,b;
      
      Test(int i,int j)
      {
          
          a=i;
          b=j;
      }
      
      void method(Test o)
      {
          o.a *=2;
          o.b /=2;
      }
  }
    public static void main(String[] args) {
        // TODO code application logic here
        
     Test ob=new Test(12, 13);
     
        
    }
}
