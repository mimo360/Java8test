/*   �ɦW:ch7_05.java        �\��:�غc�禡���h��  */

package myJava.ch07;
import java.lang.*;

public class ch7_05         //�D���O
{
    public static void main(String args[])
    {
        CMyClass X = new CMyClass();          //���鲣�ͮɵL�޼�
        CMyClass Y = new CMyClass(5,40);      //���鲣�ͦ���Ӿ�Ƥ޼�
        CMyClass Z = new CMyClass(20.2,30.6); //���鲣�ͦ���ӯB�I�Ƥ޼�
        X.showVar();
        Y.showVar();
        Z.showVar();
    } 
}    

class CMyClass
{
    public double VarA;
    private double VarB;

    public CMyClass()               //�w�q�L�Ѽƪ��غc�禡
    {
        VarA = 10;
        VarB = 10;
    }
    public CMyClass(int a,int b)    //�w�q��Ӿ�ưѼƪ��غc�禡
    {
        VarA = a;
        VarB = a + b;
    }
    public CMyClass(double a,double b)    //�w�q��ӯB�I�ưѼƪ��غc�禡
    {
        VarA = a;
        VarB = a * b;
    }
    public void showVar()
    {
        System.out.println("VarA=" + VarA);
        System.out.println("VarB=" + VarB);
    }
}
