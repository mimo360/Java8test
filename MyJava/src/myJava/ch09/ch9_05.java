/*   �ɦW:ch9_05.java         �\��:��@�h�Ӥ���  */

package myJava.ch09;
import java.lang.*;

public class ch9_05         //�D���O
{
    public static void main(String args[])
    {
        CCircle obj = new CCircle(5.0);
        obj.computeArea();
        obj.show();
        obj.draw(1);        
    } 
}    

interface ICircle        //�w�q����
{
    public static final double pi=3.14;  
    public abstract void show();
    public abstract void computeArea();
}

interface IColor        //�w�q����
{
    public abstract void draw(int i);
}

class CShape
{
    protected double area;
    public void show()
    {
        System.out.println("area=" + area);   	
    }
}

class CCircle extends CShape implements ICircle,IColor   //��@��Ӥ���
{   
   protected double radius;
   public CCircle(double i){ radius=i; }   
   @Override public void computeArea()
   {
        area = radius * radius * pi;
   }
   @Override public void draw(int i)
   {
        if(i==0)      System.out.println("�ϧά��Ŧ���");
        else if(i==1) System.out.println("�ϧά�������");
        else if(i==2) System.out.println("�ϧά������");
        else          System.out.println("�C����~");
   }     
}