package myJava.exercise.ch10;
import java.lang.*;
import java.util.Scanner;

public class ex10_02         //�D���O
{
    public static void main(String args[])  //�Эק� main���e
    {    	  
    	Scanner keyboardInput = new Scanner(System.in);
    	int x,y;
    	
    		   
    	    System.out.print("�п�Jx:");
    	    x = Integer.parseInt(keyboardInput.nextLine());
    	    System.out.print("�п�Jy:");
    	    y = Integer.parseInt(keyboardInput.nextLine());    	    
    	
    	  
    		
        System.out.println(x + "�� " + y +"����=" +powerXY(x,y));
    	    
    }
        
    static int powerXY(int x,int y)   //�ШϥΤW�@�D�]�p������method���e
    {
    	
    }    
}    

class CmyException                   //�ШϥΤW�@�D�]�p���������O���e
{
    

}
