/*  �ɦW:ch6_06.java      �\��:return��^   */

package myJava.ch06;
import java.lang.*;

public class ch6_06         //�D���O
{
    public static void main(String args[])
    {
        int k;
 
        k = func1();
        System.out.println("k=" + k);
    }
    
    public static int func1()
    {
        int a=5,b=7;
        a++;
        if (a>0) return a+b;
        a++;
        if (a>0) return a+b;
        a++;
        return a+b;
    }
}