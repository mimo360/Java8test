/*  �ɦW:ch10_08.java          �\��:�����Ҧ����ҥ~  */

package myJava.ch10;
import java.lang.*;
import java.util.Scanner;

public class ch10_08         //�D���O
{
    public static void main(String args[])
    {
        Scanner keyboardInput = new Scanner(System.in);    	
        int lottoSize=0;
        int lottoAry[];
    	
        while(true)
        {
          try
          {   	   
            System.out.print("�п�J�}�C�j�p:");
            lottoSize = Integer.parseInt(keyboardInput.nextLine());
            lottoAry = new int[lottoSize]; 
            break;	 //���Xwhile�j��    
          }
          catch(NumberFormatException e)
          {
            System.out.println("�}�C�j�p�п�J�Ʀr");
          } 
          catch(Exception e)
          {
            System.out.println("�����Ҽ{�쪺�ҥ~�o�ͤF");
          }    	
          finally
          {
          }
        }
        System.out.println("�{�����T���椤...");    	
    } 
}