/*  �ɦW:ch15_23.java          �\��:����ƱƧ�  */

package myJava.ch15;
import java.lang.*;
import java.util.Arrays;      //�ϥ�Arrays���O�ݸ��J

public class ch15_23       //�D���O
{
    public static int sum = 0;
    public static void main(String args[])
    {    
        int[] arr1 = new int[]{42,37,6,15,39,24};
        Arrays.parallelSort(arr1);

        for(int ele : arr1)
           System.out.print(ele + "\t");
    }
}
