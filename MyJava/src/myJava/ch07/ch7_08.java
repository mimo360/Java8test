/*   �ɦW:ch7_08.java     �\��:���󪺶ǰѦҭȩI�s   */

package myJava.ch07;
import java.lang.*;

public class ch7_08         //�D���O
{
    public static void main(String args[])
    {
         CVector2 i = new CVector2();
         i.set(20,40);
         CVector2 j = new CVector2();
         j.set(15,45);
         System.out.println("-----��l------");         
         System.out.println("Vector i=(" + i.x + "," + i.y + ")");
         System.out.println("Vector j=(" + j.x + "," + j.y + ")");
         CMyClass X = new CMyClass();
         X.swap(i,j);
         System.out.println("-----swap��-------");
         System.out.println("Vector i=(" + i.x + "," + i.y + ")");
         System.out.println("Vector j=(" + j.x + "," + j.y + ")");          
    } 
}    

class CMyClass
{
    public void swap(CVector2 a,CVector2 b)  //�����禡
    {
        CVector2 temp;
        temp = a;
        a = b;
        b = temp;
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