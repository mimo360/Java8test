/*  �ɦW:ch3_08.java     �\��:�r�����l��ƫ��A�d��   */

package myJava.ch03;
import java.lang.*;
import java.util.Scanner;

public class ch3_08         //�D���O
{
    public static void main(String args[])
    {
    	Scanner keyboardInput = new Scanner(System.in);
    	String str1;
        double x;
        
        System.out.print("���Dx��3����,�п�Jx:");        
        str1 = keyboardInput.nextLine();
        x=Double.parseDouble(str1);
        System.out.println("x��3���謰:" + (x*x*x));        
    }
}