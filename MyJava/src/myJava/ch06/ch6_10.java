/*   �ɦW:ch6_10.java        �\��:�ǰѦҭȩI�s(�ǻ��}�C)   */

package myJava.ch06;
import java.lang.*;

public class ch6_10         //�D���O
{
    public static void main(String args[])
    {
        int lottos[]=new int[6];
       
        generate_lottos(lottos);
        System.out.println("�ֳz���X�p�U.....");
        for(int i=0;i<6;i++)
            System.out.print(lottos[i] + "\t");
    }
    
    public static void generate_lottos(int[] arr)
    {
       for(int i=0;i<arr.length;i++)
       {
       	   arr[i] = (int)((Math.random()*49)+1);
           System.out.println("��" + (i+1) + "���H���üƬ�" + arr[i]);
       }
    }
}