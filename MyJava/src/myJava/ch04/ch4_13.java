/*  �ɦW:ch4_13.java       �\��:switch-case���r�����m��  */

package myJava.ch04;
import java.lang.*;
import java.util.Scanner;

public class ch4_13         //�D���O
{
    public static void main(String args[])
    {
      Scanner keyboardInput = new Scanner(System.in);
     
      System.out.print("�п�J�p������(����):");
      switch(keyboardInput.nextLine())
         {
           case "�u��":
               System.out.println("�^�嵥�Ĭ�A");
               break;
           case "�ҵ�":
               System.out.println("�^�嵥�Ĭ�B");
               break;
           case "�A��":
               System.out.println("�^�嵥�Ĭ�C");
               break;
           case "����":
               System.out.println("�^�嵥�Ĭ�D");
               break;
           case "�B��":
               System.out.println("�^�嵥�Ĭ�F");
               break;
           default:
               System.out.println("�z��J�F���~������");
               break;
         }
    }
}