/*  �ɦW:ch7_10.java           �\��:this����r��²���ϥΪk  */

package myJava.ch07;
import java.lang.*;

public class ch7_10         //�D���O
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
        int var=20;                     //�ϰ��ܼ�
        System.out.println("�ϰ��ܼ�var=" + var);
        System.out.println("�����ܼ�var=" + this.var);
    }
}    