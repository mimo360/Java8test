package myJava.exercise.ch05;
import java.lang.*;
import java.util.Arrays;   //�ޤJArrays���O

public class ex5_06         //�D���O
{
    public static void main(String args[])
    {
       int x[]={25,10,39,40,33,12};
       int y[];
       int spec=11;       
         
       Arrays.sort(x);
       
       //�b�����U�[�J�{��,��l�w�s�b���{�����i�ק�
       
       //�b�����W�[�J�{��,��l�w�s�b���{�����i�ק�
       System.out.println("���W");
       for(int num : x)
            System.out.print(num+ "\t");
       System.out.println();     
       System.out.println("����");
       for(int num : y)
            System.out.print(num+ "\t");
       System.out.println("\n�S�O��\t" + spec); 
    }
}