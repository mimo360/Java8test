/*  �ɦW:ch12_11.java          �\��:�ƻs�ÿ�X�ɮ�  */

package myJava.ch12;
import java.lang.*;
import java.io.*;

public class ch12_11         //�D���O
{
    public static void main(String args[]) throws IOException,FileNotFoundException 
    {
        FileInputStream fi = new FileInputStream("c:\\myJava\\ch12\\file\\text1.txt");
        FileOutputStream fo = new FileOutputStream("c:\\myJava\\ch12\\file\\text5.txt");
        BufferedInputStream bufIn = new BufferedInputStream(fi);
        BufferedOutputStream bufOut = new BufferedOutputStream(fo); 
        int fileSize = fi.available();
        byte byteData[] = new byte[fileSize];
        bufIn.read(byteData,0,fileSize);
        bufOut.write(byteData,0,fileSize);        
        String str1 = new String(byteData);        //�ഫ�줸�հ}�C���r��
        bufOut.flush();        //�O�o�nflush,�_�h��y����Ƥ��|�g�J�ɮפ�
        System.out.println("�ɮ׽ƻs����,���e�p�U");    
        System.out.println(str1);
        fi.close();       //����
        fo.close();       //����
    } 
}