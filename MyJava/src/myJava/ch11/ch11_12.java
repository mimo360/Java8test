/*  �ɦW:ch11_12.java        �\��:String�r�ꪺ�禡�m��  */

package myJava.ch11;
import java.lang.*;

public class ch11_12         //�D���O
{
 public static void main(String args[])
 {
    String str = "����r�����";
    String str1 = "This is a book"; 
    String str2;
    System.out.println("�r��[" + str + "]�@��" + str.length() + "�Ӧr��");
    System.out.println("�r��[" + str1 + "]�@��" + str1.length() + "�Ӧr��");
    System.out.println("�r�ꪺ�r����is==>" + str1.startsWith("is"));
    System.out.println("�ഫ���j�g�r��=>" + str1.toUpperCase());
    System.out.println("�b�r���}�C����[5]�Ӧr����=>" + str1.charAt(5));
        
    str2=str1.substring(5);
    System.out.println("��[5]�Ӧr�����᪺�l�r�ꬰ" + str2);
    System.out.println("�l�r�ꪺ�r����is==>" + str2.startsWith("is"));
 } 
}