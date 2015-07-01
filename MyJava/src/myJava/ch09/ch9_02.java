/*  �ɦW:ch9_02.java          �\��:�P���~�����O�ù�@����  */

package myJava.ch09;
import java.lang.*;

public class ch9_02         //�D���O
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
    public void show(); //�ŧimethod
    void computeArea(); //�ŧimethod
}

class CShape
{
    protected double area;
    public void show()
    {
        System.out.println("area=" + area);   	
    }
}

class CCircle extends CShape implements ICircle   //��@����
{   
   protected double radius;
   public CCircle(double i){ radius = i; }   
   @Override public void computeArea()
   {
        area = radius * radius * pi;
   }  
}
