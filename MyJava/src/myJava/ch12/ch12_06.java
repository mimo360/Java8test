/*  �ɦW:ch12_06.java          �\��:�ƻs��r��  */

package myJava.ch12;
import java.lang.*;
import java.io.*;

public class ch12_06         //�D���O
{
    public static void main(String args[]) 
                       throws IOException,FileNotFoundException 
    {
        char cbuf[] = new char[1];
        FileReader fr = new FileReader("c:\\myJava\\ch12\\file\\text1.txt");
        FileWriter fw = new FileWriter("c:\\myJava\\ch12\\file\\text3.txt");
        int num;
        String str1;
        while((num = fr.read(cbuf)) !=-1) //�ϥΰj��v�@�ƻs��r�ɤ��e
              fw.write(cbuf);        
        fr.close();       //����
        fw.close();       //����
    } 
}