
package constructoroverloading;

class Box{
    double height;
    double width;
   double depth;
    //Constructor .It takes  an object of type  Box
    
    Box(Box o)
    {
        width=o.width;
        height=o.height;
        depth=o.depth;
    }
    
    //Constructor used when all dimensons specified
    Box(double d,double h,double  w)
    {
        width=w;
        height=h;
        depth=d;
    }
    
    
    //Constructo used  when no dimensin has specified
     Box() {
         
         width=-1;
         height=-1;
         depth=-1;
    }
     
     //Constructor used when cube is created 
     
   Box(double  len)
   {
       width=height=depth=len;
   }
    
   
   double  volume()
   {
        return width*height*depth;
       
   }
}
public class ConstructorOverloading {

    public static void main(String[] args) {
        
        Box  b1=new Box();
        Box b2=new Box(7);
        Box b3=new Box(2, 2, 2);
        
        double vol;
        
        vol=b1.volume();
        System.out.println("The Volume Of First Box is : "+vol);
        
        
        
        vol=b2.volume();
        System.out.println("The Volume Of The Second Box Is : "+vol);
        
        
        vol=b3.volume();
        System.out.println("The Volume Of The Third Box Is : "+vol);
       
    }
}
