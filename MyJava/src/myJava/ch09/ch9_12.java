/*   �ɦW:ch9_12.java         �\��:���O���A���૬  */

package myJava.ch09;
import java.lang.*;

public class ch9_12         //�D���O
{
    public static void main(String args[])
    {
    	CA obj1;             //�ŧi�����O���A�ܼ�
    	
        obj1 = new CB();     //obj1���V�l���OCB�������        
        // obj1.show1();      //���૬�����������O���ŧi��show1()
        ((CB)obj1).show1();  //�૬��i����show1()
        obj1.show2();        //�i��������O�ŧi��show2()
        //obj1.show3();      //���૬�����������O���ŧi��show3()
        ((CB)obj1).show3();  //�૬��i����Pshow3()
        System.out.println("--------------------");
        CB obj2;             //�ŧi�l���O���A�ܼ�
        obj2 = (CB) obj1;    //obj2���Vobj1�ҫ�����(�ݭn�૬,���ઽ�����w)
        obj2.show1();      
        obj2.show2();      
        obj2.show3();           
    } 
}    

interface IA              //�w�q����
{    
    public abstract void show1();    
}

abstract class CA         //�w�q�����O
{
    public void show2()
    {
        System.out.println("This is CA's show2()");
    }  
}

class CB extends CA implements IA   // ���OCB��@�ɭ�IA
{
    @Override public void show1()
    {
        System.out.println("This is CB's show1()");
    }
    public void show3()
    {
        System.out.println("This is CB's show3()");
    }
}