/*   �ɦW:ch8_14.java       �\��:��H���O���h�h�~��   */

package myJava.ch08;
import java.lang.*;

public class ch8_14         //�D���O
{
    public static void main(String args[])
    {       	   	
        CMyRect obj = new CMyRect(5.0,15.0);    		
        obj.computeArea();       //�p�⭱�n        
        obj.show();       
    } 
}    

abstract class CShape   //�w�q��H���O
{
    protected double area;
    
    public abstract void show();        //�ŧi��H��k
    public abstract void computeArea(); //�ŧi��H��k
}

abstract class CRect extends CShape
{   //�l���OCRect�~�Ӧ����OCShape�A����������@��������H��k�A�G������H���O
    protected double length,width;
    public CRect(double i,double j){ length = i; width = j; }
    @Override public void computeArea()   //��g�A��@computeArea()
    {
        area = length * width;
    }    
}

class CMyRect extends CRect   // �l���OCMyRect�~�Ӧ����OCRect
{
    public CMyRect(double i,double j)
    {
        super(i,j);
    }
    @Override public void show()          //��g�A��@show()�禡
    {
        System.out.println("�x��area=" + area);          	
    }
}

