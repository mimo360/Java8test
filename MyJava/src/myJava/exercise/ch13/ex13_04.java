package myJava.exercise.ch13;
import java.lang.*;

public class ex13_04         //�D���O
{
    public static void main(String args[])
    {    	  
    	     CFib obj1 = new CFib(40,1);  //���ӭn���檺��Recursive��
    	     CFib obj2 = new CFib(40,2);  //���ӭn���檺��Loop��
    	     CFib obj3 = new CFib(40,3);  //���ӭn���檺��Formula��
    	        	     
    	     obj1.start(); 
    	     obj2.start(); 
    	     obj3.start();      	    	     
    }        
}    

