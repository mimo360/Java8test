/*   �ɦW:ch7_06.java      �\��:�w�]���غc�l  */

package myJava.ch07;
import java.lang.*;

public class ch7_06         //�D���O
{
    public static void main(String args[])
    {
        CMyClass X = new CMyClass(5,40);   //���鲣�ͦ���Ӿ�Ƥ޼�
        //CMyClass Y = new CMyClass();     //�L�k���������غc�l
        X.showVar();
        //Y.showVar();
    } 
}    

class CMyClass
{
    public int VarA;
    private int VarB;
    
    public CMyClass(int a,int b)    //�w�q��Ӿ�ưѼƪ��غc�禡
    {
        VarA = a;
        VarB = a + b;
    }
    
    public void showVar()
    {
        System.out.println("VarA=" + VarA);
        System.out.println("VarB=" + VarB);
    }
}
