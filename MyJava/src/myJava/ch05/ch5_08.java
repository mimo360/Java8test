/*   �ɦW:ch5_08.java     �\��:��}�C�Ƨ�    */

package myJava.ch05;
import java.lang.*;
import java.util.Arrays;   //�ޤJArrays���O

public class ch5_08         //�D���O
{
    public static void main(String args[])
    {
       int x[]={25,10,39,40,33,12};
       int spec=11;
         
       Arrays.sort(x);
       for(int num : x)
            System.out.print(num+ "\t");
       System.out.println("\n�S�O��\t" + spec); 
    }
}