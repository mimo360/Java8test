/*  �ɦW:ch9_07.java          �\��:�~�Ӧh�Ӥ�����  */

package myJava.ch09;
import java.lang.*;

public class ch9_07         //�D���O
{
    public static void main(String args[])
    {
        CCircle obj = new CCircle(5.0);
        obj.computeArea();
        obj.show();
        obj.draw(2,1);        
    } 
}    

interface ICircle        //�w�q����
{
    public static final double pi=3.14;  
    public abstract void computeArea();
}

interface IColor        //�w�q����
{
    public abstract void draw(int i);
}

interface IColorCircle extends IColor,ICircle  //�~�Ө�Ӥ�����
{
    public abstract void show();
    public abstract void draw(int i);        //�L�N�q���ŧi
    //public abstract int draw(int i);       //���~���ŧi,�]���p�W�ۦP���^�ǭȤ��P
    public abstract void draw(int i,int j);  //�s�W����k�ŧi
}

class CShape
{
    protected double area;
    public void show()
    {
        System.out.println("area=" + area);   	
    }
}

class CCircle extends CShape implements IColorCircle   //��@����
{   
   protected double radius;
   public CCircle(double i){ radius = i; }   
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
   @Override public void draw(int i,int j)
   {
        draw(i);
        if(j==0)      System.out.println("�ϧά��Ť�");
        else if(j==1) System.out.println("�ϧά����");
        else          System.out.println("��J���~");
   }
}