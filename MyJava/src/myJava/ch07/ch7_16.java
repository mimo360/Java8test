/*   �ɦW:ch7_16.java        �\��:���O�ܼƻP���O��k  */

package myJava.ch07;
import java.lang.*;

public class ch7_16         //�D���O
{
    public int Var;
    public static int sVar;
    
    public void show(String str)
    {
        System.out.println(str + "'s Var=" + Var);        
        System.out.println("ch7_16 class sVar=" + sVar);        
    }
    public static void add()        //���O��k
    {
        //Var++;        //���~,�]�����O��k�����i�H�s�������ܼ�
        sVar++;
    }
    
    public static void main(String[] args)
    {
        ch7_16 X = new ch7_16();
        ch7_16 Y = new ch7_16(); 
        X.Var = 3;
        Y.Var = 10;
        X.sVar = 5;        //�ϥΪ���s�����O�ܼ�
        X.add();         //�ϥΪ���������O��k
        Y.add();         //�ϥΪ���������O��k       
        X.show("X");
        Y.show("Y");
    }
}
