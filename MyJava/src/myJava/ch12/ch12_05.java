/*  �ɦW:ch12_05.java          �\��:�[�J��r�b��r�ɫ��  */

package myJava.ch12;
import java.lang.*;
import java.io.*;

public class ch12_05         //�D���O
{
  public static void main(String args[]) throws IOException 
  {
     String str1 = "�O��ƦC�O�@�ӵL���ƦC";
    	
     FileWriter fw = new FileWriter("c:\\myJava\\ch12\\file\\text2.txt",true);
     fw.write('\r');   fw.write('\n');   //�g�J����r��
     fw.write(str1); 
        
     fw.close();       //����
  }     
}   
