package myJava.exercise.ch15;
import java.lang.*;

public class ex15_05         //�D���O
{
    public static void main(String args[])
    {
             X obj = new X();
             obj.go();
    }        
}  



class X
{
   public void go()
   {
             int n=40;    	  
    	     Runnable task1 = new Runnable(){  //�ΦW���O  //���ӭn���檺��Recursive��
    	          
            };
    
    	     Runnable task2 = new Runnable(){    //�ΦW���O  //���ӭn���檺��Loop��
                  
            };

    	     Runnable task3 = new Runnable(){    //�ΦW���O  //���ӭn���檺��Formula��
                  
            };
    	        	     
    	     Thread obj1 = new Thread(task1);
    	     Thread obj2 = new Thread(task2);
    	     Thread obj3 = new Thread(task3);

             obj1.start(); 
    	     obj2.start(); 
    	     obj3.start(); 
   }
}  

class CFib 
{    
    public int FibRecursive(int n)
    {
        
    }

    public int FibLoop(int n)
    {
        
    }
    
    public double FibFormula(int n)
    {
        
    }
}