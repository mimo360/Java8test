/*   �ɦW:ch11_01.java          �\��:���O�w  */

package ch11;
import java.lang.*;

public class ch11_01         //�D���O
{
    public static void main(String args[])
    {
    	CCircle obj = new CCircle(5.0);
    	obj.showArea();  
    } 
}    

class CCircle
{
   protected double area;
   protected double radius;
   protected final double pi=3.14;
   public CCircle(double i){ radius = i; }
   public void showArea()
   {
        area = radius * radius * pi;
        System.out.println("Area=" + area);
   }  
}