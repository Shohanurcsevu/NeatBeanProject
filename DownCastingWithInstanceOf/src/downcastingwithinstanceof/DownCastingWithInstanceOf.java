/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package downcastingwithinstanceof;

/**
 *
 * @author SHOHANUR PC
 */
class Animal
{
    
}
class Dog3 extends Animal
{
    static void method(Animal a)
    {
        if(a instanceof Dog3)
        {
            Dog3 d=(Dog3)a;
            System.out.println("ok,Downcasting Perfomed ");
        }
    }
}
public class DownCastingWithInstanceOf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Animal a=new Dog3();
        
        Dog3.method(a);
    }
}
