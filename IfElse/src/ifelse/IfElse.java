
package ifelse;

import java.util.Scanner;


public class IfElse {
    
    
   
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int month;
        String season;
        
        System.out.println("Enter The MOnth : ");
        month=in.nextInt();
        
        if(month==12 || month==1 || month==2)
        {
            season="Winter";
           System.out.println(+month+"\t is in \t"+season);
        }
        
        else if(month==3||month==4||month==5)
        {
           season="Spring";
           System.out.println(+month+"\t is in \t"+season);
        }
        
        else if(month==6||month==7||month==8)
        {
            season="Summer";
            System.out.println(+month+"\t is in \t"+season);
        }
        else if(month==9||month==10)
        {
            season="Autum";
           System.out.println(+month+"\t is in \t"+season);
        }
      
    }
    
}
