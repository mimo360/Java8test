/*   �ɦW:ch5_01.java        �\��:�}�C�������s��    */

package myJava.ch05;
import java.lang.*;
import java.util.Scanner;

public class ch5_01         //�D���O
{
    public static void main(String args[])
    {
       int sum=0;
       double average;
       Scanner keyboardInput = new Scanner(System.in);
    	
       int trades[] = new int[4];    //�ŧitrades�}�C�ò��Ͱ}�C����    	
       for(int i=0;i<trades.length;i++)
       {
           System.out.print("��" + (i+1) + "�u����~�B:");
           trades[i] = Integer.parseInt(keyboardInput.nextLine());
           sum = sum + trades[i];
       }
       average = (double)sum / (double)12;
       System.out.println("=========================");
       System.out.println("    �~����~�B:" + sum);
       System.out.println("�����U����~�B:" + average);   	
    }
}