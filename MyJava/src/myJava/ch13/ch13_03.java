/*  �ɦW:ch13_03.java          �\��:��@Runnable���h������{��  */

package myJava.ch13;
import java.lang.*;

public class ch13_03         //�D���O
{
    public static void main(String args[])
    {
        CCar car1 = new CCar("Ford");
        CCar car2 = new CCar("Toyota");
        Thread obj1 = new Thread(car1);   //��������Thread����
        Thread obj2 = new Thread(car2);   //��������Thread����
        obj1.start();  //�u���ϥ�Thread����~�����start()�Ұʦh�����
        obj2.start();  //�u���ϥ�Thread����~�����start()�Ұʦh�����
    }
}

class CWheeledDevices
{
        int wheel;
}

class CCar extends CWheeledDevices implements Runnable
{                                //��@Runnable�i��{�h�����
    String manufacturer;
    public CCar(String str){ wheel = 4; manufacturer = str; }    
    public void run()        //JVM�۰ʰ���
    {
        for(int i=1;i<=3;i++)
        {
           for(int t=1;t<100000000;t++) 
                ;  //�Űj��,�i������34�����⦸�������ɶ�
           System.out.println(manufacturer + " is running");
        }
    }
}
