/*  �ɦW:ch4_18.java      �\��:continue�ԭz���ܽd   */

package myJava.ch04;
import java.lang.*;

public class ch4_18         //�D���O
{
    public static void main(String args[])
    {
       int Sum=0;
       for(int i=1;i<=10;i++)
       {
         if((i%2)==1)
            continue;
         Sum=Sum+i;
       }
       System.out.println("2+4+6+8+10=" + Sum);
    }
}