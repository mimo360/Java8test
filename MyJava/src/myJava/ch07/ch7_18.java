/*   �ɦW:ch7_18.java      �\��:static�Ϭq   */

package myJava.ch07;
import java.lang.*;

public class ch7_18        //�D���O
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
    public static int Var;
    
    public static void show(String str)
    {
        System.out.println(str+ "Var=" + Var);        
    }
    static{
        Var = 100;
        System.out.println("���O�ܼ�Var��l�Ƨ���" + Var);
        show("��l�Ƥ���");
    }
}
