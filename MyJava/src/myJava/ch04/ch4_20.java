/*  �ɦW:ch4_20.java      �\��:while�j�骺�ܽd  */

package myJava.ch04;
import java.lang.*;
import java.util.Scanner;

public class ch4_20         //�D���O
{
    public static void main(String args[])
    {
      Scanner keyboardInput = new Scanner(System.in);                 
      int x,y,gcd,temp;
      
      System.out.print("��Jx:");
      x=Integer.parseInt(keyboardInput.nextLine());
      System.out.print("��Jy:");
      y=Integer.parseInt(keyboardInput.nextLine());
      System.out.print("(" + x + "," + y + ")=");
      if(x<y)          // �N���j���ƭȩ�bx,���p����by
      {
         temp = x;   x = y;   y = temp;    // x,y�ƭȹ��
      }
      while(x!=0)
      {
         x=x%y;
         if(x!=0)
         {
            temp = x;   x = y;   y = temp;    // x,y�ƭȹ��
         }
      }
      gcd=y;
      System.out.println(gcd);
    }
}