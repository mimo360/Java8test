/*   �ɦW:ch8_03.java        �\��:super���m��   */

package myJava.ch08;
import java.lang.*;

public class ch8_03         //�D���O
{
    public static void main(String args[])
    {
    	CB objB =  new CB(10);           //objB�O�l���O����
        objB.show();
    } 
}    

class CA
{
    public int varX;
    public CA()
    {
    	System.out.println("�����O�L�Ѽƫغc�l���椤...");
    }
    public CA(int i)
    {
    	varX = i;
    }
}

class CB extends CA   // �l���OCB�~�Ӧ����OCA
{
    public int varX;          //�s�W�������ܼ�,�P�����O�����P�W
    public CB(){}
    public CB(int i)
    {
    	super(i);     //�I�s�����O�غc�lpublic CA(int i),������b�Ĥ@��
    	varX = 100;      
    }
    public void show()      //�s�W�������禡
    {
    	super.varX++;      
    	System.out.println("�l���OvarX=" + varX);
    	System.out.println("�����OvarX=" + super.varX);
    }
}