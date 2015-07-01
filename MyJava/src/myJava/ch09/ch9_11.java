/*   �ɦW:ch9_11.java          �\��:�ʺAô���P�R�Aô��  */

package myJava.ch09;
import java.lang.*;

public class ch9_11         //�D���O
{
    public static void main(String args[])
    {
        CA obj;           //�ŧi�����O���A�ܼ�
        obj = new CB();   //obj���V�l���OCB�������
        //obj.show1();    //�sĶ�ɴ��Y�i���L�k����A�]��CA���ŧi��method
        obj.show2();      //�Q�ŧi��final����k,���R�Aô��
        obj.show3();      //�]���Oabstract method�A�G���o�ͦh������g(�ʺAô��)
        obj.show4();      //�ϥΰʺAô���H���T�����k
        System.out.println("--------------------");
        obj = new CC();   //obj���V�l���OCC�������
        //obj.show1();      //�sĶ�ɴ��Y�i���L�k����A�]��CA���ŧi��method
        obj.show2();      //�Q�ŧi��final����k,���R�Aô��
        obj.show3();      //�]���Oabstract method�A�G���o�ͦh������g(�ʺAô��)
        obj.show4();      //�ϥΰʺAô���H���T�����k        
    } 
}    

interface IA              //�w�q����
{    
    public abstract void show1();    
}

abstract class CA         //�w�q�����O
{
    public final void show2()
    {
        System.out.println("This is CA's show2()");
    } 	
    public abstract void show3();
    public void show4()
    {
        System.out.println("This is CA's show4()");
    }
    
}

class CB extends CA implements IA   // ���OCB��@�ɭ�IA
{
    public void show1()
    {
        System.out.println("This is CB's show1()");
    }
    public void show3()
    {
        System.out.println("This is CB's show3()");
    }
}

class CC extends CA implements IA   // ���OCC��@�ɭ�IA
{
    public void show1()
    {
        System.out.println("This is CC's show1()");
    }
    public void show3()
    {
        System.out.println("This is CC's show3()");
    }
    public void show4()
    {
        System.out.println("This is CC's show4()");
    }
}