/*   �ɦW:ch8_05.java        �\��:@Override���m��   */

package myJava.ch08;
import java.lang.*;

public class ch8_05         //�D���O
{
    public static void main(String args[])
    {
        CB objB =  new CB();           //objB�O�l���O����
        objB.show();
        objB.show(10);
        objB.show(10.0);
    } 
}    

class CA
{
    public void show()
    {
        System.out.println("�ثe��������O��show()");
    }
}

class CB extends CA   // �l���OCB�~�Ӧ����OCA
{
    @Override public void show()
    {
        System.out.println("�ثe����l���O��show()");    	
    }
    public void show(int x)
    {
        System.out.println("�ثe����l���O��show(" + x +")");
    }
    public void show(double x)
    {
        System.out.println("�ثe����l���O��show(double)");
        super.show();
    }
}