/*  �ɦW:ch11_10.java          �\��:�۰ʸ˽c�P�۰ʩ�c  */

package myJava.ch11;
import java.lang.*;

public class ch11_10         //�D���O
{
    public static void main(String args[])
    {
        Double myDouble = 5.0;              //�۰ʸ˽c
        double D1 = myDouble;               //�۰ʩ�c
        //int I1 = myDouble;                //�۰ʩ�c����
        int I1 = myDouble.intValue();       //��c
        System.out.println("D1=" + D1);
        System.out.println("I1=" + I1);
    } 
}