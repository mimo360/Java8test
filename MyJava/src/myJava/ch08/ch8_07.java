/*   �ɦW:ch8_07.java        �\��:�����O���A�ܼưѦҤl���O�������   */

package myJava.ch08;
import java.lang.*;

public class ch8_07         //�D���O
{
    public static void main(String args[])
    {
        CA obj =  new CB();  
        obj.show1();         //�i����l���O��g���禡
        obj.show2();         //�i�����~�Ӫ��禡
        //obj.show3();  
    } 
}    

class CA
{
    protected int varA;
    public void show1()
    {
        System.out.println("�����Oshow1()���椤");
    }
        public void show2()
    {
        System.out.println("�����Oshow2()���椤");
    }
}

class CB extends CA   // �l���OCB�~�Ӧ����OCA
{
    protected int varB;
    @Override public void show1()
    {
        System.out.println("�l���O��g��show1()���椤");
    }
    public void show3()
    {
        System.out.println("�l���O�s�W��show3()���椤");
    }
}
