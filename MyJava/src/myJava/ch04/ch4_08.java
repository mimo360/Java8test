/*  �ɦW:ch4_08.java    �\��:else-if�榡���m��   */

package myJava.ch04;
import java.lang.*;
import java.util.Scanner;

public class ch4_08         //�D���O
{
    public static void main(String args[])
    {
      Scanner keyboardInput = new Scanner(System.in);
      int Score;
     
      System.out.print("�п�J�p�����Z:");
      Score = Integer.parseInt(keyboardInput.nextLine());
      if(Score<60) { System.out.println("���Ƶ��Ŭ��B��"); }
      else if(Score<=69) { System.out.println("���Ƶ��Ŭ�����"); }
      else if(Score<=79) { System.out.println("���Ƶ��Ŭ��A��"); }
      else if(Score<=89) { System.out.println("���Ƶ��Ŭ��ҵ�"); }
      else if(Score<=99) { System.out.println("���Ƶ��Ŭ��u��"); }
      else if(Score==100) { System.out.println("��������"); }
      else { System.out.println("�z��J�F���X�k������"); }
    }
}