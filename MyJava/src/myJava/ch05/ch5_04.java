/*   �ɦW:ch5_04.java        �\��:�G���}�C���m��   */

package myJava.ch05;
import java.lang.*;

public class ch5_04         //�D���O
{
    public static void main(String args[])
    {
       // �ŧi�G���}�Cm[9][9]�A�@��81�Ӥ����A�qm[0][0]~m[8][8]
       int m[][] = new int[9][9];
 
       for(int i=1;i<=9;i++)
          for(int j=1;j<=9;j++)
             m[i-1][j-1] = i * j;   // �N�E�E���k�����G�s�J�G���}�C��
       
       for(int i=1;i<=9;i++)
       {
          for(int j=1;j<=9;j++)
             System.out.print(i + "*" + j + "=" + m[i-1][j-1] + "\t");
          System.out.println();
       }
    }
}
