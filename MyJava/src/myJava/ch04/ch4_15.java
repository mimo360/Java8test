/*  �ɦW:ch4_15.java      �\��:for�j�骺�ܽd  */

package myJava.ch04;
import java.lang.*;
import java.util.Scanner;

public class ch4_15         //�D���O
{
    public static void main(String args[])
    {
        Scanner keyboardInput = new Scanner(System.in);         
        int Sum=0,n;
      
        System.out.print("�п�JN��:");
        n=Integer.parseInt(keyboardInput.nextLine()); 
      
        for(int i=1;i<=n;i=i+2)
            Sum = Sum + i;
        if((n%2)==1)
            System.out.println("1+3+...+N=" + Sum);
        else
            System.out.println("1+3+...+N-1=" + Sum);
    }
}