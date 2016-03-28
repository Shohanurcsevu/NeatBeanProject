
package nestedswitchcase;

import java.util.Scanner;


public class NestedSwitchCase {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int fchoice;
        int schoice;
        System.out.println("\n\t1.CSE\n\t2.EEE");
        System.out.print("\n\tPlease Enter your Department : ");
        fchoice=in.nextInt();
        int n = 10;
  
        switch(fchoice)
        {
            case 1:
            {
                System.out.println("\n\tWelcome To CSE Department\n\t1.First\n\t2.Seconf\n\t3.Third\n\t4.Fourth\n\t5.Fifth\n\t6.Sixth");
                System.out.print("\n\tPlease Select Your Semester : ");
                schoice=in.nextInt();
                switch(schoice)
                {
                    case 1:
                        System.out.println("\n\tYou Are In First Semester ");
                        break;
                }
                break;
        }
            case 2:
                System.out.println("\n\tYou Are In EEE Department");
                break;
        
       
    }
        
    }
    
    
}
