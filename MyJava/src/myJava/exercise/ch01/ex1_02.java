package myJava.exercise.ch01;
import java.lang.*;
import java.util.Scanner;

public class ex1_02         
{
    public static void main(String args[])  
    {    	  
    	   Scanner keyboardInput = new Scanner(System.in); 
    	   int x;
    	   System.out.print("�п�Jx=");
    	   x=Integer.parseInt(keyboardInput.nextLine());    //�ҥ~���ͳB
    	   System.out.println("x�����謰=" + (x*x));             
    }    
}