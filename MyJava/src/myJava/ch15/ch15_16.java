/*   �ɦW:ch15_16.java       �\��:�b�D��J�ѼƳB�ϥ�Lambda�B�⦡  */

package myJava.ch15;
import java.lang.*;

public class ch15_16         //�D���O
{    
    public static void main(String args[])
    {
        Runnable task1 =  () -> 
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
            };

        Thread obj1 = new Thread(task1);          
        Thread obj2 = new Thread(task1);

        obj1.start();  
        obj2.start();
    }
}