/*  �ɦW:ch6_08.java        �\��:����6��1~49���H���ü�  */

package myJava.ch06;
import java.lang.*;
import java.lang.Math;      //randon�������O,�i�ٲ�

public class ch6_08         //�D���O
{
    public static void main(String args[])
    {
        int lottos[]=new int[6];
        
        for(int i=1;i<=6;i++)
        {
       	   lottos[i-1] = (int)((Math.random()*49)+1);
       	   System.out.println("��" + i + "���H���üƬ�" + lottos[i-1]);
        }
    }
}