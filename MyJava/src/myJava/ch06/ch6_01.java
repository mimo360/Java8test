/*  �ɦW:ch6_01.java      �\��:�I�sstatic method   */

package myJava.ch06;
import java.lang.*;
import java.lang.Math;      //pow,log10�������O,�i�ٲ�

public class ch6_01         //�D���O
{
    public static void main(String args[])
    {
        double i=7.0,j=4.0;
        double powNum,logNum;
    	    	
        powNum = Math.pow(i,j);
        System.out.println(i + "��" + j + "����=" + powNum);
        logNum = Math.log10(powNum);
        System.out.println(powNum + "��10�����=" + logNum);    	
    }
}