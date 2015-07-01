/*   �ɦW:ch9_13.java     �\��:�����ѼƻP�����^�ǭ�   */

package myJava.ch09;
import java.lang.*;

public class ch9_13         //�D���O
{
    public static void main(String args[])
    {
         CA objCA = new CA();       //objCA��CA���O������
         CB objCB = new CB();       //objCB��CB���O������
         //--------------------------------------------------------
         objCB.show3(objCA);        //��CA���O�������@�޼ƶǤJ
         //--------------------------------------------------------
         objCA=(CA)objCB.set(10);   //�ѩ�^�ǭȳQ�ŧi�������A�]���ݭn�૬
         System.out.println("objCA�����varB=" + objCA.varB);
    } 
}    

interface IA              //�w�q����
{    
    public static final int varA=5;
    public abstract void show1();    
}

class CA implements IA   // ���OCA��@�ɭ�IA
{
    public int varB;
    public CA()      { varB = 0; } //�غc�l
    public CA(int i) { varB = i; } //�غc�l
    @Override public void show1()
    {
         System.out.println("This is CA's show1()");
    }
    public void show2()
    {
         System.out.println("This is CA's show2()");
    }
}

class CB
{
    public void show3(IA obj)     //�ѼƳQ�ŧi���������A
    {
         System.out.println("�ǤJ������varA��쬰" + obj.varA);
         obj.show1();
         //obj.show2(); // ���椣�X�k�Aobj�Q�ŧi��IA�����A���i���椶�����ŧi��method
    } 
    public IA set(int i)     //�^�ǭȳQ�ŧi���������AIA
    {
         CA obj = new CA(i);
         return obj; //�^�Ǫ��OCA���O������A��CA��@�FIA�A�G�����૬
    }       
}