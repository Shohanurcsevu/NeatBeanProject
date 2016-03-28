
package switchcase;

import java.util.Scanner;


public class SwitchCase {

  
    public static void main(String[] args) {
        // TODO code application logic here
        
        int choice;
        Scanner in=new Scanner(System.in);
        System.out.println("\n\t1.Winter\n\t2.Spring\n\t3.Summer\n\t4.Autum");
        System.out.print("\n\tPlease Enter Your Choice Here : ");
        
        choice=in.nextInt();
        
        switch(choice)
        {
            case 1:
                System.out.println("\n\tDecember, January, February");
                break;
            case 2:
                System.out.println("\n\tMarch , April,May");
                break;
            case 3:
                System.out.println("\n\tJune,July,August");
                break;
            case 4:
                System.out.println("\n\tSeptember,Octobor,Nobembor");
        }
    }
    
}
