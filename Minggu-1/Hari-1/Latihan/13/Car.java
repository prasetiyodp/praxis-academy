public class Car extends Vehicle {

    public static void main(final String args[]) {
 
         final Vehicle a = new Car();
         final boolean result = a instanceof Car;
       System.out.println( result );
    }
 }