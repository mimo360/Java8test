/*   �ɦW:ch6_11.java       �\��:�^�ǰ}�C   */

package myJava.ch06;
import java.lang.*;

public class ch6_11         //�D���O
{
    public static void main(String args[])
    {
        int lottos[];
       
        lottos = generate_lottos();
        System.out.println("�ֳz���X�p�U.....");
        for(int num : lottos)
            System.out.print(num + "\t");
    }
    
    public static int[] generate_lottos()
    {
       int arr[]=new int[6];
       for(int i=0;i<arr.length;i++)
       {
           arr[i]= (int)((Math.random()*49)+1);
           System.out.println("��" + (i+1) + "���H���üƬ�" + arr[i]);
       }
       return arr;
    }
}