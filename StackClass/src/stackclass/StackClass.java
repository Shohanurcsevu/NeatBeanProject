
package stackclass;

import java.util.Scanner;




public class StackClass {
    
    int topOS;
    int mystack[]=new int[100];

    public StackClass() {
        
        topOS=-1;
    }
    
    public void Push(int x)
    {
        topOS=topOS+1;
        
        mystack[topOS]=x;
    }
    
    public int Pop()
    {
       
        return topOS--;
    }
    public int Size()
    {
        return topOS;
    }
    
    public int Top()
    {
        return mystack[topOS];
    }

    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        // TODO code application logic here
        
        StackClass 
        ob=new StackClass();
        System.out.println("Enter The Size Of the stack : ");
        
        int s=in.nextInt();
        
        for(int i=0;i<s;i++)
        {
            System.out.print("Enter At The Position["+i+"]=");
           int temp=in.nextInt();
           ob.Push(temp);
        }
        
        System.out.print("Enter The Deletion Number : ");
        int d=in.nextInt();
        
        for(int i=0;i<d;i++)
        {
            System.out.println("[Poped]");
            ob.Pop();
        }
        
        System.out.println("The Size Of The  Stack After Poping : "+ob.Size());
        
        
    }
    
    
}
