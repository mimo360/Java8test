/*   �ɦW:ch15_15.java       �\��:Lambda�B�⦡�PRunnable����  */

package myJava.ch15;
import java.lang.*;

public class ch15_15         //�D���O
{    
    public static void main(String args[])
    {
        Runnable task1 = new Runnable(){   //�H�ΦW�������O�覡����
            public void run()
            {
                for(int i=1;i<=3;i++)
                {
                    try
                    {
                        Thread.sleep((long)(1000*Math.random())); //��v0~1����
                    }
                    catch(InterruptedException e){}
                    System.out.println(Thread.currentThread().getName()  + " is running");
                }
            }
        };   

        Thread obj1 = new Thread(task1);          
        Thread obj2 = new Thread((Runnable) () -> 
            {
                for(int i=1;i<=3;i++)
                {
                    try
                    {
                        Thread.sleep((long)(1000*Math.random())); //��v0~1����
                    }
                    catch(InterruptedException e){}
                    System.out.println(Thread.currentThread().getName()  + " is running");
                }
            }); 

        obj1.start();  //�u���ϥ�Thread����~�����start()�Ұʦh�����
        obj2.start();
    }
}