/*   �ɦW:ch9_10.java          �\��:�������A�ܼưѦҹ�@���O�������   */

package myJava.ch09;
import java.lang.*;

public class ch9_10         //�D���O
{
    public static void main(String args[])
    {
        int i;
        IA obj =  new CA();  //�������A�ܼưѦҹ�@���O�������
        obj.show1();         //�i���椶���ŧi����k(�Ѥl���O��g��method)
        i = obj.varA;        //�i�s�������w�q�����
        //obj.varB = 10;     //���i�s���s�W�������ܼ�
        //obj.show2();       //���i���s�W��method 
    } 
}    

interface IA              //�w�q����
{    
    public static final int varA=5;  
    public abstract void show1();
}

class CA implements IA   // ���OCB��@�ɭ�IA
{
    public int varB;    
    @Override public void show1()
    {
        System.out.println("��@���O��g��show1()���椤");
    }
    public void show2()
    {
        System.out.println("��@���O�s�W��show2()���椤");
    }
}
