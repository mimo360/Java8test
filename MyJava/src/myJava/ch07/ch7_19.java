/*   �ɦW:ch7_19.java      �\��:���O�����L�W�Ϭq   */

package myJava.ch07;
import java.lang.*;

public class ch7_19        //�D���O
{
    public static void main(String args[])
    {
        CMyClass X = new CMyClass();
        X.show("�ϥΪ���I�s��");        
    } 
}       

class CMyClass
{
    public int Var;
    public CMyClass()
    {
        Var = 10;
        System.out.println("�غc�禡���椤");
        show("�غc�禡���槹����");
    }
    public void show(String str)
    {
        System.out.println(str+ "Var=" + Var);        
    }
    {
        Var = 100;
        System.out.println("�L�W�϶����椤");
        show("�L�W�϶����槹����");
    }
}
