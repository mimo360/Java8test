/*  �ɦW:ch4_06.java      �\��:�_����ܽd��   */

package myJava.ch04;
import java.lang.*;
import java.util.Scanner;

public class ch4_06         //�D���O
{
    public static void main(String args[])
    {
      Scanner keyboardInput = new Scanner(System.in);
      int Credit,Status;  //�H���B��,ú�ڪ��A
      double Year;        // ���d�~��
    	
      System.out.print("�п�J�H���B��:");
      Credit = Integer.parseInt(keyboardInput.nextLine());
      System.out.print("ú�ڬO�_���`(1:���`,0:�����`):");
      Status = Integer.parseInt(keyboardInput.nextLine());
      if(Status==1)
      {
        System.out.print("�п�J���d�~��:");
        Year = Double.parseDouble(keyboardInput.nextLine());
        if(Year>=0.5)
        {
          if(Year<1)
          {
            System.out.println("�w�ɲ{�����B��"+(Credit*0.05)+"��");
          }
          else  //������25�檺if
          {
            System.out.println("�w�ɲ{�����B��"+(Credit*0.1)+"��");
          }
        }
        else  //������23�檺if
        {
          System.out.println("�w�ɲ{�����B��0��");
        }
      }
      else   //������19�檺if
      {
        System.out.println("�w�ɲ{�����B��0��");
      }
    }
}