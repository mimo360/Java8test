/*  �ɦW:ch6_19.java        �\��:���j�禡�D�O��ƦC  */

package myJava.ch06;
import java.lang.*;

public class ch6_19         //�D���O
{
    public static void main(String args[])
    {
        System.out.print("�O��ƦC�p�U:");
        for(int i=0;i<=25;i++)
        {
           if(i%8==0)
              System.out.println();
           System.out.print(Fib(i) + "\t");
        }   
        System.out.println("......");
    } 
    
    public static int Fib(int n)
    {
        if((n==1) || (n==0))
          return n;
        else
          return Fib(n-1) + Fib(n-2);
    }
}