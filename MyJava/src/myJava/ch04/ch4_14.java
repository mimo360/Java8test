/*  �ɦW:ch4_14.java      �\��:falling through���ܽd  */

package myJava.ch04;
import java.lang.*;
import java.util.Scanner;

public class ch4_14         //�D���O
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
           case 9:
               System.out.println("���Ƶ��Ŭ��u��");
           case 8:
               System.out.println("���Ƶ��Ŭ��ҵ�");
           case 7:
               System.out.println("���Ƶ��Ŭ��A��");
           case 6:
               System.out.println("���Ƶ��Ŭ�����");
           default:
               System.out.println("���Ƶ��Ŭ��B��");
         }
    }
}