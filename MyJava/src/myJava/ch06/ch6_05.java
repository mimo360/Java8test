/*   �ɦW:ch6_05.java      �\��:�L�ǤJ�޼ƤΦ^�ǭȪ��禡    */

package myJava.ch06;
import java.lang.*;

public class ch6_05         //�D���O
{
    public static void main(String args[])
    {
       print99();   // �禡�I�s */    	
    }
    
    public static void print99()  // �禡�w�q
    {
       for(int i=1;i<=9;i++)
       {
         for(int j=1;j<=9;j++)
             System.out.print(i + "*" + j + "=" + i*j + "\t");
         System.out.println();
       }
    }
}