/*   �ɦW:ch12_01.java          �\��:�H�r����yŪ����r��  */

package myJava.ch12;
import java.lang.*;
import java.io.*;

public class ch12_01         //�D���O
{
    public static void main(String args[]) throws IOException,FileNotFoundException 
    {
        char cbuf[] = new char[256];
        FileReader fr = new FileReader("c:\\myJava\\ch12\\file\\text1.txt");
        
        int num = fr.read(cbuf);     //Ū���̦h256�Ӧr����cbuf�}�C��
        String str1 = new String(cbuf,0,num);  //�r���}�C�ഫ���r��
        System.out.println("�`�@Ū��" + num + "�Ӧr����");
        System.out.println("�ɮפ��e�p�U");
        System.out.println(str1); 
        fr.close();       //����
    } 
}   
