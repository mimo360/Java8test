package myJava.exercise.ch15;
import java.lang.*;

public class ex15_03         //�D���O
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
             String str1 = new String();
    	     
    	     Runnable Soup = new Runnable(){    //�ΦW���O
    	       
    	     };

    	     Runnable Salad = new Runnable(){    //�ΦW���O 
    	       
    	     };

    	     Runnable Entree = new Runnable(){    //�ΦW���O          
    	       
    	     };

    	     Runnable Dessert = new Runnable(){    //�ΦW���O          
    	       
    	     }; 
	     
    	     Thread obj1 = new Thread(Soup);
    	     Thread obj2 = new Thread(Salad);
    	     Thread obj3 = new Thread(Entree);
    	     Thread obj4 = new Thread(Dessert);
             obj1.start(); 
    	     obj2.start(); 
    	     obj3.start();  
    	     obj4.start();  
   }
}

    

