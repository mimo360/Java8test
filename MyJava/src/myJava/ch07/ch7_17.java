/*  �ɦW:ch7_17.java     �\��:���O�W�٦s�����O����  */

package myJava.ch07;
import java.lang.*;

public class ch7_17         //�D���O
{
    public static void main(String args[])
    {
        CMyClass.show("�ק�e");    //�������O��k
        CMyClass.Var = 20;          //�s�����O�ܼ�
        CMyClass.show("�ק��");    //�������O��k
        CMyClass X = new CMyClass();
        X.show("�ϥΪ���I�s��");
    } 
}       

class CMyClass
{
    public static int Var=10;
    
    public static void show(String str)
    {
        System.out.println(str+ "Var=" + Var);        
    }
}
