package myJava.exercise.ch05;
import java.lang.*;

public class ex5_10
{
    public static void main(String args[])
    {
        String stations[]={"�x�_","�O��","���","�s��","�x��","�Ÿq","�x�n","����"};
        int prices_taipei[]={1490,1350,1080,700,290,160,30};
        int prices[][]= new int[7][];
        for(int i=0;i<prices.length;i++)
           prices[i]=new int[7-i];            //���ͤ��W�h�G���}�C���ĤG��
        for(int i=0;i<prices_taipei.length;i++)
           prices[0][i]=prices_taipei[i];      //�]�w�x�_�ܦU��������
         
        //�Ѧ��B�}�l���g�{��
        

        //�H�U�O��l�N�����{��
        for(int i=0;i<stations.length;i++)
             System.out.print("\t" + stations[stations.length-i-1]);
        System.out.println();        

        for(int i=0;i<prices.length;i++)
        {
          System.out.print(stations[i]+ "\t");
          for(int j=0;j<prices[i].length;j++)
             System.out.print(prices[i][j] + "\t");
          System.out.println(" -");
        }
         System.out.println(stations[stations.length-1]+"\t"+" -");
    }
}