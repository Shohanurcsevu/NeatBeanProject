
package recursion;

import java.util.Scanner;

class Factorial
{
    //this is recursive mode
    
    int fact(int n)
    {
        int result;
        if(n==1)
            
        {
            return 1;
        }
        result=n*fact(n-1);
        
        return result;
        
    }
}

public class Recursion {

  
    public static void main(String[] args) {
        
          int a = 0;
        Factorial f=new Factorial();
        
        Scanner in=new Scanner(System.in);
      
        
        while(a!=1)
        {
          System.out.println("Enter The Number  To  calculate factorial : ");  
        a=in.nextInt();
        System.out.println("The factorial Of The  Given Number Is : "+f.fact(a));
        }
       
        
      
    }
}
