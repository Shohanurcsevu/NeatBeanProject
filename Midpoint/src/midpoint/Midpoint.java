
package midpoint;


public class Midpoint {

   
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        int i=100;
        int j=200;
        while(++i<--j);
        
         System.out.println("Midpoint: "+i);
            
            int mid=(i+j)/2;
            System.out.println("Midpoint "+mid);
        
    }
    
}
