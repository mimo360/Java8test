/*  �ɦW:ch4_07.java       �\��:����B�⦡���m��   */

package myJava.ch04;
import java.lang.*;
import java.util.Scanner;

public class ch4_07         //�D���O
{
    public static void main(String args[])
    {
      Scanner keyboardInput = new Scanner(System.in);
      int Credit,Status;  //�H���B��,ú�ڪ��A
      double Year=0;        // ���d�~��
    	
      System.out.print("�п�J�H���B��:");
      Credit = Integer.parseInt(keyboardInput.nextLine());
      System.out.print("ú�ڬO�_���`(1:���`,0:�����`):");
      Status = Integer.parseInt(keyboardInput.nextLine());
      if(Status!=1)
      {
         System.out.println("�w�ɲ{�����B��0��");
      }
      else
      {
         System.out.print("�п�J���d�~��:");
         Year = Double.parseDouble(keyboardInput.nextLine());
      }
      if((Status==1) && (Year>=0.5) && (Year<1))
         System.out.println("�w�ɲ{�����B��"+(Credit*0.05)+"��");
      if((Status==1) && (Year>=1))
         System.out.println("�w�ɲ{�����B��"+(Credit*0.1)+"��");
      if((Status==1) && (Year<0.5))
         System.out.println("�w�ɲ{�����B��0��");
    }
}