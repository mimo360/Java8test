/*  �ɦW:ch3_01.java   �\��:��L��J�d��   */

package myJava.ch03;
import java.lang.*;
import java.util.Scanner;

public class ch3_01         //�D���O
{
    public static void main(String args[])
    {      
        Scanner keyboardInput = new Scanner(System.in);
        String str1,str2;
        
        System.out.print("�п�J�Ĥ@�Ӧr��:");
        str1 = keyboardInput.nextLine();
        System.out.print("�п�J�ĤG�Ӧr��:");
        str2 = keyboardInput.nextLine(); 
        System.out.println("�z�ҿ�J���r��p�U:");
        System.out.println(str1);
        System.out.println(str2);  
    }
}