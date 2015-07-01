/*   �ɦW:ch9_01.java        �\��:�w�q�����P��@����  */

package myJava.ch09;
import java.lang.*;

public class ch9_01         //�D���O
{
    public static void main(String args[])
    {
        CCircle obj = new CCircle(5.0);
        obj.computeArea();
        obj.show();        
    } 
}    

interface ICircle        //�w�q����
{
    double pi=3.14;     //�ŧifield
    void show();        //�ŧimethod
    void computeArea(); //�ŧimethod
}

class CCircle implements ICircle   //��@����
{
   protected double area;
   protected double radius;
   public CCircle(double i){ radius = i; }
   @Override public void show()
   {
        System.out.println("area=" + area);   	
   }
   @Override public void computeArea()
   {
        area = radius * radius * pi;
   }  
}
