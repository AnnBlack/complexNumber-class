public class Application
{
    
    
    public static void main(String[] args)
    { 
         ComplexNumber c1 = new ComplexNumber();
         ComplexNumber c2 = new ComplexNumber(1);
         ComplexNumber c3 = new ComplexNumber(1,4);
         ComplexNumber c4 = new ComplexNumber(5,1);
         System.out.println(c1.toString());
         System.out.println(c2.toString());
         System.out.println(c3.toString());
         System.out.println(c4.toString());
         System.out.println(c4.inverse().toString());
         System.out.println(c4.inverse().multiply(c2).toString());
         System.out.println(c2.multiply(c2).toString());
         System.out.println(c3.multiply(c4).toString());
    }
}