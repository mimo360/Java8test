/*  �ɦW:ch4_05.java     �\��:�u?:�v�B��l�d��   */

package myJava.ch04;
import java.lang.*;
import java.util.Scanner;

public class ch4_05         //�D���O
{
    public static void main(String args[])
    {
        Scanner keyboardInput = new Scanner(System.in);
        String str1 = new String("���߱z�q��F,���~�O�@�]�Ĩ�.");
        int Ans=38; /* ���׬�38 */
        int Guess;
        
        System.out.print("�вq�@��1~99�����X:");        
        Guess=Integer.parseInt(keyboardInput.nextLine());
        if(Guess!=Ans)
              str1 = (Guess>Ans) ? "�z�q�o�Ӥj�F" : "�z�q�o�Ӥp�F" ;
        System.out.println(str1);    	
    }
}