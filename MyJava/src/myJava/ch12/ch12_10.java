/*  �ɦW:ch12_10.java          �\��:Ū���G�i���ɹ��ɸ��  */

package myJava.ch12;
import java.lang.*;
import java.io.*;
    
public class ch12_10        //�D���O
{
    public static void main(String args[]) throws IOException,FileNotFoundException 
    {
        byte data[] = new byte[54];
        int filesize,value1,value2,value3,value4,low,high;

        FileInputStream fi = new FileInputStream("c:\\myJava\\ch12\\file\\PG30009.bmp");       
        int fileSize = fi.available();
        int num; 
        num = fi.read(data,0,54);     //Ū���e54�Ӧ줸��
 
        int title[] = new int[6];
        for(int i=2;i<5;i++)
        {
           if(data[i]<0)
               title[i] = (int)data[i] + 256;  //�Y��ƳQ�P�w���t��
           else
               title[i] = (int)data[i];
            
        }

        low = title[2] % 16;
        high = (title[2]-low) / 16;
        value1 = high*16 + low;
 
        low = title[3] % 16;
        high = (title[3]-low) / 16;
        value2 = high*16*16*16 + low*16*16;

        low = title[4] % 16;
        high = (title[4]-low) / 16;
        value3 = high*16*16*16*16*16 + low*16*16*16*16;
 
        low = title[5] % 16;
        high = (title[5]-low) / 16;
        value4 = high*16*16*16*16*16*16*16 + low*16*16*16*16*16*16;

        filesize = value1 + value2 + value3 + value4;

        System.out.println("�ɮפj�p��" + filesize + "�Ӧ줸��");
        fi.close();       //����
    } 
}
