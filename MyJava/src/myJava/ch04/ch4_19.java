/*  �ɦW:ch4_19.java     �\��:break�ԭz���ܽd  */

package myJava.ch04;
import java.lang.*;
import java.util.Scanner;

public class ch4_19         //�D���O
{
    public static void main(String args[])
    {
      Scanner keyboardInput = new Scanner(System.in);
      int Sum=0,i,n;
      
      System.out.print("�D1~N���`�M,�п�JN��:");
      n=Integer.parseInt(keyboardInput.nextLine()); 
      for(i=1;i<=n;i++)
      {
        if(Sum>Integer.MAX_VALUE-100)
           break;
        Sum=Sum+i;
      }
      System.out.println("1~" + (i-1) + "���`�M��" + Sum);
    }
}