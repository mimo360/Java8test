/*  �ɦW:ch12_03.java          �\��:try-with-resources  */

package myJava.ch12;
import java.lang.*;
import java.io.*;

public class ch12_03         //�D���O
{
    public static void main(String args[])
    {
        char cbuf[] = new char[256];
       
        try(FileReader fr = new FileReader("c:\\myJava\\ch12\\file\\text1.txt"))
        {
           int num = fr.read(cbuf);   //Ū���̦h256�Ӧr����cbuf�}�C��
           String str1 = new String(cbuf,0,num);  //�r���}�C�ഫ���r��
           System.out.println("�`�@Ū��" + num + "�Ӧr����");
           System.out.println("�ɮפ��e�p�U");
           System.out.println(str1); 
           fr.close();       //����
        }
        catch(FileNotFoundException e)
        {
            System.out.println("�ҥ~�o��:�䤣����ɮ�");
        }
        catch(final IOException e)
        {
            System.out.println("�ҥ~�o��:�ɮצs�����~");
        }        
    } 
}   
