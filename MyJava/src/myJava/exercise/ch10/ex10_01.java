package myJava.exercise.ch10;
import java.lang.*;

public class ex10_01         //�D���O
{
    public static void main(String args[])  //�ŭק� main���e
    {    	  
    	     System.out.println("2�� 5����=" +powerXY(2,5));
             System.out.println("2�� 0����=" +powerXY(2,0));
    	     System.out.println("0�� 0����=" +powerXY(0,0));  //�ҥ~
    	     System.out.println("2�� -2����=" +powerXY(2,-2)); //�ҥ~
    }
    
    static int powerXY(int x,int y)   //�i�ק�powerXY���e
    {
    	int result=1;    	

    	  for(int i=1;i<=y;i++)
    	  {
    	    result = result * x;
    	  }    	  

    	return result;       
    }    
}    

class CmyException                      //�i�ק�CmyException���O
{

}
