/*   �ɦW:ch8_13.java       �\��:��H���O�P��H��k  */

package myJava.ch08;
import java.lang.*;

public class ch8_13         //�D���O
{
    public static void main(String args[])
    {   
        //CShape obj =  new CShape(); //���~�A��H���O���ಣ�ͪ���    	
        CRect obj1 = new CRect(5.0,15.0);
        CCircle obj2 = new CCircle(3.0);    	 	
        obj1.computeArea();       //�p�⭱�n   
        obj2.computeArea();       //�p�⭱�n   
        System.out.print("�x��");
        obj1.show();
        System.out.print("���");
        obj2.show();
    } 
}    

abstract class CShape   //�w�q��H���O
{
    protected double area;
    
    public void show()
    {
        System.out.println("area=" + area);          	
    }
    public abstract void computeArea(); //�ŧi��H��k
}

class CRect extends CShape   // �l���OCRect�~�Ӧ����OCShape
{
    protected double length,width;
    public CRect(double i,double j){ length = i; width = j; }
    @Override public void computeArea()   //��g�A��@computeArea()
    {
        area = length * width;
    }    
}

class CCircle extends CShape   // ���OCCircle�~�Ӧ����OCShape
{
    protected double radius;
    protected final double pi=3.14;
    public CCircle(double i) { radius = i; }    
    @Override public void computeArea()   //��g�A��@computeArea()
    {
        area = radius * radius * pi;
    }   
}