/*  �ɦW:ch7_07.java      �\��:�ǻ�����P��������  */

package myJava.ch07;
import java.lang.*;

public class ch7_07         //�D���O
{
    public static void main(String args[])
    {
         CVector2 i = new CVector2();
         i.set(20,40);
         CVector2 j = new CVector2();
         j.set(15,45);
         CVector2 k;     //k�OCVector2�����ܼ�,�b��16��Ψӱ����^�ǭ�
         CMyClass X = new CMyClass();
         k = X.sum(i,j);
         System.out.println("Vector i=(" + i.x + "," + i.y + ")");
         System.out.println("Vector j=(" + j.x + "," + j.y + ")"); 
         System.out.println("Vector k=i+j=(" + k.x + "," + k.y + ")");
    } 
}    

class CMyClass
{
    public int sum(int a,int b)
    {
        return a+b;
    }
    public double sum(double a,double b)
    {
        return a+b;
    }
        
    public CVector2 sum(CVector2 a,CVector2 b)//�G���V�q���[�k�����禡
    {
        CVector2 tempVector = new CVector2();
        tempVector.x = a.x + b.x;
        tempVector.y = a.y + b.y;
        return tempVector;
    }
}

class CVector2                      //�G���V�q���O
{
  public int x,y;               //�G���V�q���ⶵ�������
  public void set(int m,int n)  //�Ω�]�w�G���V�q���ⶵ�������
  {
        x = m;
        y = n;      
  }
}
