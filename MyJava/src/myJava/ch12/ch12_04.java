/*  �ɦW:ch12_04.java          �\��:�H�r����y�g�J��r��  */

package myJava.ch12;
import java.lang.*;
import java.io.*;

public class ch12_04         //�D���O
{
    public static void main(String args[]) throws IOException 
    {
        String str1 = "�O��ƦC�p�U:";
        char endCh[] = {'C','o','n','t','i','n','u','e','.','.','.'};
        int numF;
        FileWriter fw = new FileWriter("c:\\myJava\\ch12\\file\\text2.txt");
        
        fw.write(str1); 
        fw.write('\r');   fw.write('\n');   //�g�J����r��

        for(int i=1;i<10;i++)
        {
            numF = Fib(i);
            fw.write(numF+" ");   //int�P�r��s��,�|�۰��૬���r��
        }
        
        fw.write(endCh);        
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
