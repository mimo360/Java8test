/*   �ɦW:ch5_03.java       �\��:�}�C�P�Ƨ�    */

package myJava.ch05;
import java.lang.*;

public class ch5_03         //�D���O
{
    public static void main(String args[])
    {
       int x[] = {25,10,39,40,33,12};
       int spec=11;
       int k,times,temp;
  
       k = x.length-1;   //x.length=6 ,�N�� 6�y
       while(k!=0)
       { 
          times = 0;
          for(int i=0;i<=k-1;i++)
          {
             if(x[i]>x[i+1])
             {
              temp = x[i]; x[i] = x[i+1]; x[i+1] = temp;  // x[i]<->x[i+1]
              times = i;
             }
          }
          k = times;
       }
       for(int num : x)         //�ϥ�foreach�y�k�e�}
            System.out.print(num+ "\t");
       System.out.println("\n�S�O��\t" + spec);   
    }
}