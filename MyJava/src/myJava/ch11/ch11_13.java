/*  �ɦW:ch11_13.java          �\��:StringBuffer�r�ꪺ�禡�m��  */

package myJava.ch11;
import java.lang.*;

public class ch11_13         //�D���O
{
 public static void main(String args[])
 {
    StringBuffer strBuf = new StringBuffer("����r�����");
    StringBuffer strBuf1 = new StringBuffer("This is a book!");
    System.out.print("�r��[" + strBuf + "]�@��");
    System.out.println(strBuf.length() + "�Ӧr��");
    StringBuffer strBuf2 = strBuf.reverse(); //strBuf�PstrBuf2���V�P�@����
    System.out.println("strBuf�r��e�q��" + strBuf.capacity() + "�Ӧr��");
    System.out.println("strBuf����ᬰ[" + strBuf +"]");
    strBuf.setCharAt(3,'t');      
    System.out.println("strBuf2��[" + strBuf2 +"]");
  
    System.out.print("strBuf1��l�r�ꤺ�e��" + strBuf1);
    System.out.println("���׬�" + strBuf1.length());
    strBuf1.replace(10,14,"pen");     //�ץ���10~13�Ӧr����pen
    System.out.print("strBuf1����䤺�e��" + strBuf1);
    System.out.println("���׬�" + strBuf1.length());  
 } 
}