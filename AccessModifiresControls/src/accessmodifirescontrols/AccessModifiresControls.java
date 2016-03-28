
package accessmodifirescontrols;


public class AccessModifiresControls {
    
             int a ;//Default Access
             public int  b; //Public Acces
             private int c; //Private Acces
             
             //mthod to access c
             
             void setc(int i)
             {
                 c=i;
             }
             
             int getc()
             {
                 return c;
             }

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        AccessModifiresControls ob=new AccessModifiresControls();
        
         //Its ok, a can be accessed directly
        ob.a=10;
        System.out.println("The Value Of a: "+ob.a);
        
        ob.setc(200);
        System.out.println("The valu of c: "+ob.getc());
        ob.getc();
        
         try{
             ob.c=200;
         }
         catch(IllegalAccessError e)
         {
             System.out.println("C can't be accessed directly ");
         }
         
         //It's ok b can be accessed directly
        ob.b=20;
        
        System.out.println("The Value of b: "+ob.b);
        
        
        
        
    }
    
}
