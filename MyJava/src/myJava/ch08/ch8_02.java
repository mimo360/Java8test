/*  �ɦW:ch8_02.java         �\��:�~�Ӫ��غc�l���涶��   */

package myJava.ch08;
import java.lang.*;

public class ch8_02         //�D���O
{
    public static void main(String args[])
    {
        CB objB =  new CB();           //objB�O�l���O����
        objB.show();
    } 
}    

class CA
{
    protected int varX;
    public CA()
    {
        System.out.println("�����O�غc�l���椤....");
        varX = 10;
    }
}

class CB extends CA   // ���OCB�~�Ӧ����OCA
{
    public CB()
    {
        System.out.println("�l���O�غc�l���椤....");    	 
    }
    public void show()  
    {
        System.out.println("varX=" + varX);
    }
}