
package upcasting;

class Bike
{
    public void run()
    {
        System.out.print("Running");
    }
}
class Splender extends Bike
{
    @Override
    public void run()
    {
        System.out.print("Running Safely");//Upcasting
    }
}


public class Upcasting {

   
    public static void main(String[] args) {
        
        Bike b=new Splender();
        b.run();
        
    }
}
