/*  �ɦW:ch12_07.java          �\��:�ϥνw�İ�Ū����r��  */

package myJava.ch12;
import java.lang.*;
import java.io.*;

public class ch12_07         //�D���O
{
    public static void main(String args[]) throws IOException,FileNotFoundException 
    {
        String str1;
        FileReader fr = new FileReader("c:\\myJava\\ch12\\file\\text1.txt");
        BufferedReader bufferIn = new BufferedReader(fr);
        
        while((str1=bufferIn.readLine())!=null)
        {
               System.out.println(str1); 
        }                
        fr.close();       //����
    } 
}   
