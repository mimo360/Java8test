/*  �ɦW:ch3_09.java       �\��:�ƭ���r��d��   */

package myJava.ch03;
import java.lang.*;

public class ch3_09         //�D���O
{
    public static void main(String args[])
    {
       short a=100;
       int b=200;
       float d=3.5f;
       double e=4.8d;  //�۷�� double d=4.8;       
       String s1,s2;
       
       s1=String.valueOf(a+b)+String.valueOf(a)+String.valueOf(b);
       s2=Float.toString(d)+Double.toString(e);
       System.out.println("s1 = " + s1);
       System.out.println("s2 = " + s2);
    }
}