/*  �ɦW:ch5_05.java      �\��:�G���}�C���m��   */

package myJava.ch05;
import java.lang.*;

public class ch5_05         //�D���O
{
    public static void main(String args[])
    {
        double scores[][] = {{85,78,65,0},
                            {75,85,69,0},
                            {63,67,95,0},
                            {94,92,88,0},
                            {74,65,73,0}};
 
        System.out.println("�p��\t�ƾ�\t�^��\t����");
        System.out.println("==============================");
        for(int i=0;i<5;i++)
        {
          scores[i][3] = (scores[i][0]+scores[i][1]+scores[i][2])/3;
          for(int j=0;j<4;j++)
             System.out.print(scores[i][j] + "\t");
          System.out.println();
        }  
    }
}