/*  �ɦW:ch12_08.java          �\��:�ϥνw�İϼg�J��r��  */

package myJava.ch12;
import java.lang.*;
import java.io.*;

public class ch12_08         //�D���O
{
    public static void main(String args[]) throws IOException 
    {
        String str1 = "�O��ƦC�p�U:";
        char endCh[] = {'C','o','n','t','i','n','u','e','.','.','.'};
        int numF;
        FileWriter fw = new FileWriter("c:\\myJava\\ch12\\file\\text4.txt");
        BufferedWriter bufferOut = new BufferedWriter(fw,20);
                
        bufferOut.write(str1); 
        bufferOut.newLine();       //�g�J����r��
        for(int i=1;i<10;i++)
        {
            numF = Fib(i);
            bufferOut.write(numF+" ");   //int�P�r��s��,�|�۰��૬���r��
        }
        bufferOut.newLine();       //�g�J����r��
        bufferOut.write(endCh);
        bufferOut.flush();         //���n,�Ьݵ���
        fw.close();       //����
    } 
    public static int Fib(int n)
    {
        if((n==1) || (n==0))
           return n;
        else
           return Fib(n-1) + Fib(n-2);
    }
}   
