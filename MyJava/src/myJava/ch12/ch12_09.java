/*  �ɦW:ch12_09.java          �\��:�ƻs�ɮ�  */

package myJava.ch12;
import java.lang.*;
import java.io.*;

public class ch12_09         //�D���O
{
    public static void main(String args[]) throws IOException,FileNotFoundException 
    {
        byte byteData[] = new byte[1];
        FileInputStream fi = new FileInputStream("c:\\myJava\\ch12\\file\\pic1.jpg");
        FileOutputStream fo = new FileOutputStream("c:\\myJava\\ch12\\file\\pic2.jpg");
        int fileSize = fi.available();
        int num;        
        while((num = fi.read(byteData)) !=-1) //�ϥΰj��v�@�ƻs�C�@�Ӧ줸��
             fo.write(byteData);        
        System.out.println("�ɮפj�p=" + fileSize + "�줸�սƻs����");
        fi.close();       //����
        fo.close();       //����
    } 
}