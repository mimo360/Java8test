/*  �ɦW:ch13_01.java          �\��:��@������̧ǰ���{��  */

package myJava.ch13;
import java.lang.*;

public class ch13_01         //�D���O
{
    public static void main(String args[])
    {
        CCar obj1 = new CCar("Ford");
        CCar obj2 = new CCar("Toyota");
        obj1.run();
        obj2.run();    	
    } 
}

class CCar
{
    String manufacturer;
    public CCar(String str){ manufacturer = str; }    
    public void run() 
    {
        for(int i=1;i<=3;i++)
        {
            for(int t=1;t<100000000;t++) 
                ;  //�Űj��,�i������27�����⦸�������ɶ�
            System.out.println(manufacturer + " is running");
        }
    }
}