/*  �ɦW:ch12_02.java          �\��:�ϥΰj��Ū����r�ɪ��������e  */

package myJava.ch12;
import java.lang.*;
import java.io.*;

public class ch12_02         //�D���O
{
    public static void main(String args[]) throws IOException,FileNotFoundException 
    {
        char cbuf[] = new char[16];
        FileReader fr = new FileReader("c:\\myJava\\ch12\\file\\text1.txt");
        int num;
        String str1;
        while((num = fr.read(cbuf)) !=-1) //�ϥΰj��Ū����r�ɪ��������e
        {
            str1 = new String(cbuf,0,num);  //�r���}�C�ഫ���r��
            System.out.println("�`�@Ū��" + num + "�r����");
            System.out.println(str1); 
            System.out.println("-----------------------");
        }
        fr.close();       //����
    } 
}   
