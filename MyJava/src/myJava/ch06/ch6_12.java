/*   �ɦW:ch6_12.java       �\��:�`�Ƿj�M�k  */

package myJava.ch06;
import java.lang.*;
import java.util.Scanner;

public class ch6_12         //�D���O
{
    public static void main(String args[])
    {
        int workArr[]={43,23,67,27,39,15,39,37,57,26,14};
        int findNum,location;
        Scanner keyboardInput = new Scanner(System.in);
 
        System.out.print("�п�J�z�n�䪺�ƭ�:");
        findNum = Integer.parseInt(keyboardInput.nextLine());
        location = seqSearch(findNum,workArr);
        if(location==-1)
           System.out.println("�b�}�C���䤣��n�䪺�ƭ�");
        else
           System.out.println("�ƭ�" + findNum + "���work[" + location + "]");
    }
    
    public static int seqSearch(int target,int[] arr)
    {
        for(int i=0;i<arr.length;i++)
           if(target == arr[i])       // ���F
              return i;
        return -1;                  // �����䤣��
    }
}