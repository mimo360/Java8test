/*  �ɦW:ch3_02.java  �\��:��L��J�d�� - ����ܿ�J�r��   */

package myJava.ch03;
import java.lang.*;
import java.io.Console;

public class ch3_02         //�D���O
{
    public static void main(String args[])  
    {
       Console console = System.console();
       String str1;
       char[] PW;               //�ŧi�r���}�C
        
       System.out.println("�п�J�b��:");       
       str1 = console.readLine();
       PW = console.readPassword("�п�J�K�X:");
       System.out.println("�z�ҿ�J���b���αK�X�p�U:");
       System.out.println(str1);
       System.out.println(PW);        
    }
}
