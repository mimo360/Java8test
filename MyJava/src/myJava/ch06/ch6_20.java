/*   �ɦW:ch6_20.java     �\��:�ϥΰj��D�O��ƦC   */

package myJava.ch06;
import java.lang.*;

public class ch6_20         //�D���O
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
        int n1=0,n2=0,sum=1;
        
        if((n==1) || (n==0))
           return n;
        else
        {
           for(int i=2;i<=n;i++)
           {
              n1 = sum;
              sum = sum + n2;
              n2 = n1;
           }
           return sum;
        }
    }
}