/*  �ɦW:ch9_04.java          �\��:�����R�A��k���@�ΤεL�k��g  */

package myJava.ch09;
import java.lang.*;

public class ch9_04         //�D���O
{
    public static void main(String args[])
    {
        CCircle1 obj1 = new CCircle1();       
        CCircle2 obj2 = new CCircle2();       
        obj1.show();            //���檺�O�����kshow
        ICircle.show();         //���檺�OICircle�������R�A��kshow
        CCircle2.show();        //���檺�OCCircle2���O���R�A��kshow        
    } 
}    

interface ICircle        //�w�q����
{
    public static void show()            //�ŧi�������R�A��kshow()
    {
        System.out.println("�������R�A��k");   
    }     
}

class CCircle1 implements ICircle   //��@����
{   
   public void show()               //���i�H�[�W@Override 
   {
        System.out.println("show�����k");
   }   
}

class CCircle2 implements ICircle   //��@����
{   
   public static void show()       //�ݩ�CCirecle���R�A��k 
   {
        System.out.println("CCircle2���O�w�q��show");
   }   
}