/*  �ɦW:ch13_04.java          �\��:sleep��k�Ȱ��h�����  */

package myJava.ch13;
import java.lang.*;

public class ch13_04         //�D���O
{
    public static void main(String args[])
    {
        CCar obj1 = new CCar("Ford");
        CCar obj2 = new CCar("Toyota");
        obj1.start();
        obj2.start();    	
    } 
}

class CCar extends Thread  //�~��Thread�i��{�h�����
{
    String manufacturer;
    public CCar(String str){ manufacturer = str; }    
    public void run()    
    {
        for(int i=1;i<=3;i++)
        {
           try   //sleep�|��X�ҥ~,�ҥH�n�]�btry..catch��
           {
                 sleep((long)(1000*Math.random())); //��v0~1����
           }
           catch(InterruptedException e){} 
           System.out.println(manufacturer + " is running");
        }
    }
}
