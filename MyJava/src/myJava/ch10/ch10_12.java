/*  �ɦW:ch10_12.java      �\��:���s��X�ҥ~  */

package myJava.ch10;
import java.lang.*;
import java.util.Scanner;

public class ch10_12         //�D���O
{
    public static void main(String args[])
    {
        Scanner keyboardInput = new Scanner(System.in);
        int ary[] = new int[]{0,5,10,15,20,25,30,35,40,45};
        int x=0,num=0;
        try                              //�~�htry�϶�
        {          
             try
             {
                 System.out.print("�аݭnŪ���}�C�ĴX�Ӥ���:");
                 x = Integer.parseInt(keyboardInput.nextLine());
                 num = ary[x];
                 System.out.println("ary[" + x + "]=" + num);
             }
             catch(ArrayIndexOutOfBoundsException e)
             {
                 System.out.println("�ҥ~�o��:�s���W�L�}�C�j�p�d��!");
             }                
             catch(NumberFormatException e)
             {
                 System.out.println("�������૬�ҥ~,�ǳƥ�ѥ~�h�B�z");
                 throw e;  
             }            
                
        }
        catch(NumberFormatException e)    //�~�hcatch�϶�
        {             
             System.out.println("�ҥ~�o��:���������ƭ�!");
        }
        
        System.out.println("...�{���Y�N����...");    	
    } 
}