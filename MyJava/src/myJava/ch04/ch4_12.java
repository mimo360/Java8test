/*  �ɦW:ch4_12.java       �\��:switch-case���m��  */

package myJava.ch04;
import java.lang.*;
import java.util.Scanner;

public class ch4_12         //�D���O
{
    public static void main(String args[])
    {
      Scanner keyboardInput = new Scanner(System.in);
      int Score;
     
      System.out.print("�п�J�p�����Z:");
      Score=Integer.parseInt(keyboardInput.nextLine());            
      if((Score>=0) && (Score<=100))
         switch(Score / 10)
         {
           case 10:
               System.out.println("��������");
               break;
           case 9:
               System.out.println("���Ƶ��Ŭ��u��");
               break;
           case 8:
               System.out.println("���Ƶ��Ŭ��ҵ�");
               break;
           case 7:
               System.out.println("���Ƶ��Ŭ��A��");
               break;
           case 6:
               System.out.println("���Ƶ��Ŭ�����");
               break;
           default:
               System.out.println("���Ƶ��Ŭ��B��");
               break;
         }
    }
}