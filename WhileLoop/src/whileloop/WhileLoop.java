
package whileloop;

import java.util.Scanner;


public class WhileLoop {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner in=new Scanner(System.in);
        System.out.print("Enter The Value Of Test");
        
        int n=in.nextInt();
        
        while(n>0)
        {
            System.out.println("Eneter A and B");
            int a=in.nextInt();
            int b=in.nextInt();
            int sum=a+b;
            System.out.println("The reult is "+sum);
        }
    }
    
}
