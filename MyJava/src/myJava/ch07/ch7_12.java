/*  �ɦW:ch7_12.java     �\��:�b�غc�禡���ϥ�this(�޼ƦC)   */

package myJava.ch07;
import java.lang.*;

public class ch7_12         //�D���O
{
    public static void main(String args[])
    {
        CMyClass X = new CMyClass(3);   //���鲣�ͮɩI�s��22�檺�غc�l
        CMyClass Y = new CMyClass(5,40);//���鲣�ͮɩI�s��27�檺�غc�l
        X.showVar();
        Y.showVar();
    } 
}    

class CMyClass
{
    public int VarA;
    private int VarB;
    public CMyClass(){}       //�}�n���ߺD�O�ɤW�@�ӨS���Ѽƪ��غc�禡
    public CMyClass(int i)           //�w�q�@�Ӿ�ưѼƪ��غc�禡
    {
        VarA = 1;
        VarB = i;
    }
    public CMyClass(int a,int b)    //�w�q��Ӿ�ưѼƪ��غc�禡
    {
        this(b);                    //�I�s��22�檺�غc�禡,�ǥH�]�wVarB
        VarA = a * b;        
    }
    public void showVar()
    {
        System.out.println("VarA=" + VarA);
        System.out.println("VarB=" + VarB);        
    }
}
