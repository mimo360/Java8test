/*   �ɦW:ch6_15.java        �\��:�]�p�ֳz�}���C��  */

package myJava.ch06;
import java.lang.*;

public class ch6_15         //�D���O
{
    public static void main(String args[])
    {
        int special;              //�s��S�O��
        int lottos[]=new int[6];   //�s�񤻲y

        special = generate_lottos(lottos);
        System.out.println("�ֳz���X�p�U.....");
        for(int num : lottos)
           System.out.print(num + "\t");
        System.out.println();
        System.out.println("�S�O��:" + special);       
    } 
    
    public static int generate_lottos(int[] arr)
    {
        int generateNum;

        for(int i=0;i<arr.length;i++)
        {
          generateNum = (int)((Math.random()*49)+1);
          while (seqSearch(generateNum,arr)!=-1)  //�O�_�P�}�C��������
          {
            generateNum = (int)((Math.random()*49)+1);
          }
          arr[i] = generateNum;
        }
        generateNum = (int)((Math.random()*49)+1);
        while (seqSearch(generateNum,arr)!=-1)  // �S�O���O�_�P��L���X����
        {
           generateNum = (int)((Math.random()*49)+1);
        }
        return generateNum;
    }
    
    public static int seqSearch(int target,int[] arr)
    {
        for(int i=0;i<arr.length;i++)
           if(target == arr[i])       // ���F
              return i;
        return -1;                  // �����䤣��
    }
}