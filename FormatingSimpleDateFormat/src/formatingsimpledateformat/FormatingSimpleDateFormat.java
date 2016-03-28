
package formatingsimpledateformat;

import java.text.SimpleDateFormat;
import java.util.Date;


public class FormatingSimpleDateFormat {

    public static void main(String[] args) {
        Date d=new Date();
        
        SimpleDateFormat ft= new SimpleDateFormat();
        
        System.out.print("Current Date: "+ft.format(d));
    }
}
