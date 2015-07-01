/*  �ɦW:ch6_17.java        �\��:�]�p�ֳz�}���C��  */

package myJava.ch06;
import java.lang.*;

public class ch6_17         //�D���O
{
    public static void main(String args[])
    {
        int special,balls=6;              //�s��S�O��
        
        if(args.length>0)
           balls = Integer.parseInt(args[0]);
        if((balls>48)||(balls<0)) return;      //�y�ƿ��~�A���}
        int lottos[]=new int[balls];            //�s��balls�y
        special = generate_lottos(lottos);
        System.out.println("�ֳz���X�p�U.....");
        for(int i=0;i<balls;i++)
        {
           if((i%6==0)&&(i!=0))
               System.out.println();
           System.out.print(lottos[i] + "\t");
        }
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