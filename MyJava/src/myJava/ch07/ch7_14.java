/*   �ɦW:ch7_14.java          �\��:����}�C�P�غc�禡   */

package myJava.ch07;
import java.lang.*;

public class ch7_14         //�D���O
{
    public static void main(String args[])
    {
        CMyClass X[] = new CMyClass[3];
        System.out.println("------------------");
        for(int i=0;i<X.length;i++)
            X[i] = new CMyClass();
                   
        CMyClass Y[] = new CMyClass[3];
        System.out.println("------------------");
        for(int i=0;i<Y.length;i++)
            Y[i] = new CMyClass(i+10);
    } 
}    

class CMyClass
{
    public int VarA;
    private int VarB;
    public CMyClass()       //�L�Ѽƪ��غc�禡
    {
        System.out.println("�L�Ѽƪ��غc�禡���椤");
    }
    public CMyClass(int i)
    {
        System.out.println("���Ѽƪ��غc�禡���椤,�ѼƬ�" + i);
    }
}