/*  �ɦW:ch15_22.java          �\��:lambda�B�⦡�PforEach��k  */

package myJava.ch15;
import java.lang.*;
import java.util.*;      //�ϥ�Collections Framework�����O�ݸ��J

public class ch15_22       //�D���O
{
    public static int sum = 0;
    public static void main(String args[])
    {
        HashSet<Integer> objHS = new HashSet<Integer>();
        objHS.add(7);     objHS.add(6);
        objHS.add(3);    objHS.add(5);

        System.out.print("HashSet���X:");
        objHS.forEach(obj ->  System.out.print(obj + "\t"));
        System.out.println();
        objHS.forEach((obj) -> 
                       {
                          sum = sum + obj;
                       });

        System.out.println("���X�������M:" + sum);
    }  
}