/*   �ɦW:ch7_15.java        �\��:�ǻ�����}�C�P����t�m����   */

package myJava.ch07;
import java.lang.*;

public class ch7_15         //�D���O
{
    public static void main(String args[])
    {
        CMyClass X[] = new CMyClass[5];
        for(int i=0;i<X.length;i++)
            X[i] = new CMyClass();
        COtherClass Obj = new COtherClass();
        Obj.show(X);
    } 
}    

class COtherClass
{    
    public void show(CMyClass X[])
    {
        for(int i=0;i<X.length;i++)
            System.out.println("����X[" + i + "]���骺��}�b" + X[i]);
    }
}

class CMyClass
{
    public int VarA;
    private int VarB;
}