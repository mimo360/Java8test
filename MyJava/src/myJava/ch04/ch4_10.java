/*  �ɦW:ch4_10.java    �\��:�B�I�Ƥ��   */

package myJava.ch04;
import java.lang.*;
import java.util.Scanner;

public class ch4_10         //�D���O
{
    public static void main(String args[])
    {
      Scanner keyboardInput = new Scanner(System.in);
      double k,tk=40.5;

      System.out.println("�@�x��=0.6����");
      System.out.print("�а�" + tk + "�x�絥��X����:");
      k=Double.parseDouble(keyboardInput.nextLine());
      if(k==tk*0.6)
         System.out.println("����F!"); 
      else
         System.out.println("�����F!");
    }
}