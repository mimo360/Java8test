/*   �ɦW:ch5_02.java        �\��:foreach�y�k�e�}���~��    */

package myJava.ch05;
import java.lang.*;
import java.util.Scanner;

public class ch5_02         //�D���O
{
    public static void main(String args[])
    {
       int sum=0;
       double average;
       Scanner keyboardInput = new Scanner(System.in);
    	
       int trades[] = new int[4];    //�ŧitrades�}�C�ò��Ͱ}�C����    	
       for(int element : trades)
       {
           System.out.print("�U�u����~�B:");
           element = Integer.parseInt(keyboardInput.nextLine());
           sum = sum + element;
       }
       average = (double)sum / (double)12;
       System.out.println("=========================");
       System.out.println("    �~����~�B:" + sum);
       System.out.println("�����U����~�B:" + average); 
       //System.out.println("trades[0]=" + trades[0]);     	
    }
}