/*    �ɦW:ch6_18.java          �\��:final�}�C�Ѽ�  */

package myJava.ch06;
import java.lang.*;

public class ch6_18         //�D���O
{
    public static void main(String args[])
    {
        int orgArr[] = new int[3];
        for(int i=0;i<orgArr.length;i++)
            orgArr[i] = i;
        func1(orgArr);
        for(int i=0;i<orgArr.length;i++)
            System.out.println("orgArr[" + i + "]=" + orgArr[i]);       
    } 
    
    public static void func1(final int[] arr1)
    {
        int arr2[]={5,10,15};
        for(int i=0;i<arr1.length;i++)
            arr1[i] = arr1[i] * arr1[i];        
        //arr1 = arr2;                //���X�k���ԭz
    }
}