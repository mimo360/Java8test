/*  �ɦW:ch4_01.java      �\��:if��ܩʱԭz�d��   */

package myJava.ch04;
import java.lang.*;
import java.util.Scanner;

public class ch4_01         //�D���O
{
    public static void main(String args[])
    {
        Scanner keyboardInput = new Scanner(System.in);
        int x;
        String str1 = new String("�z��J���O���Ʃ�0");
    	       
        System.out.print("�п�J�@�Ӿ��:");        
        x = Integer.parseInt(keyboardInput.nextLine());
        if(x<0)
            str1 = "�z��J���O�t��";
        System.out.println(str1);
    }
}