/*   �ɦW:ch7_09.java          �\��:�ϰ��ܼƻP�����ܼƦP�W  */

package myJava.ch07;
import java.lang.*;

public class ch7_09         //�D���O
{                     
    public static void main(String args[])
    {         
         CMyClass X = new CMyClass();
         X.show();
    }
}

class CMyClass
{
    public int var=10;    //�����ܼ� 
    public void show()
    {
        int var=20;                         //�ϰ��ܼ�
        System.out.println("var=" + var);   //�N�|���Ψ�ϰ��ܼ� 
    }
}