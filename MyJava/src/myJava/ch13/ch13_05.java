/*  �ɦW:ch13_05.java          �\��:join()��k���ݦh���������  */

package myJava.ch13;
import java.lang.*;

public class ch13_05         //�D���O
{
    public static void main(String args[])
    {
        CCar obj1 = new CCar("Ford");
        CCar obj2 = new CCar("Toyota");    	
        obj1.start();
        try   //join()�|��X�ҥ~,�ҥH�n�]�btry..catch��
        {
           obj1.join();   //���ݥ������������~���U����䥦�{��
           System.out.println("obj1������w�����u�@");    	   
           obj2.start();    	   
        }
        catch(InterruptedException e){}    	
    } 
}

class CCar extends Thread  //�~��Thread�i��{�h�����
{
    String manufacturer;
    public CCar(String str){ manufacturer = str; }    
    public void run()        //JVM�۰ʰ���
    {
        for(int i=1;i<=3;i++)
        {
           for(int t=1;t<100000000;t++) 
                ;  //�Űj��,�i������33�����⦸�������ɶ�
           System.out.println(manufacturer + " is running");
        }    	
    }
}
