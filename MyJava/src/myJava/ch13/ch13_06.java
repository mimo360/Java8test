/*  �ɦW:ch13_06.java          �\��:���ݳB�z���P�B���D  */

package myJava.ch13;
import java.lang.*;

public class ch13_06         //�D���O
{
    public static void main(String args[])
    {
        COperation atmObj = new COperation();  
        COperation counterObj = new COperation();
    	
        atmObj.start();
        counterObj.start();    	
    } 
}

class CAccount
{
    static int balance=10000; //�b��l�B
    static int accoutNo=8529; //�b��
		
    public static void checkBalance()
    {
        int temp=balance;
        //sleep������L�]���ɭPThread�Q�Ȱ�
        try  {Thread.sleep((long)(1000*Math.random())); }
        catch(InterruptedException e){}
        System.out.print(Thread.currentThread().getName()+"���椤:");
        System.out.println("�b��" + accoutNo + "����" + temp + "��");
    }
}

class COperation extends Thread  //�h��������O
{    
    public void run()    
    {
        CAccount.checkBalance();
    }
}
