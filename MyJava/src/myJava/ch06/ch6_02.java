/*  �ɦW:ch6_02.java      �\��:�w�q,�I�s�禡   */

package myJava.ch06;
import java.lang.*;
import java.util.Scanner;

public class ch6_02         //�D���O
{
    public static void main(String args[])
    {
        int k;
        double Ans;
        Scanner keyboardInput = new Scanner(System.in);
        
        System.out.print("�p��3.5��k����?�п�Jk=");
        k = Integer.parseInt(keyboardInput.nextLine());
        Ans = power(3.5,k);                         //  �I�s�禡
        System.out.println("3.5��" + k + "����=" + Ans);  	
    }
    
    public static double power(double X,int n)    //�禡�w�q
    {
        int i;
        double powerXn=1; 
        for(i=1;i<=n;i++)
            powerXn = powerXn * X;
        return powerXn;
    }
}