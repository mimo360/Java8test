/*   �ɦW:ch8_04.java        �\��:��g(override)���m��   */

package myJava.ch08;
import java.lang.*;

public class ch8_04         //�D���O
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
    public void show()
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