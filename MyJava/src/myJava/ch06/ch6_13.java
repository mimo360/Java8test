/*   �ɦW:ch6_13.java      �\��:�G���j�M�k  */

package myJava.ch06;
import java.lang.*;
import java.util.Scanner;

public class ch6_13         //�D���O
{
    public static void main(String args[])
    {
        int workArr[]={33,41,52,54,63,74,79,86};
        int findNum,location;
        Scanner keyboardInput = new Scanner(System.in);
 
        System.out.print("�п�J�z�n�䪺�ƭ�:");
        findNum = Integer.parseInt(keyboardInput.nextLine());
        location = binarySearch(workArr,findNum);
        if(location==-1)
           System.out.println("�b�}�C���䤣��n�䪺�ƭ�");
        else
           System.out.println("�ƭ�" + findNum + "���work[" + location + "]");
    }
    
    public static int binarySearch(int[] x,int k)
    {
        int left,right,middle;
        left = 0;
        right = x.length-1;

        while(left<=right)
        {
           middle = (left + right) / 2;
           if(k==x[middle])  return middle;
           if(k>x[middle])   left = middle + 1;    // ��󥪥b��
           else              right = middle - 1;   // ���k�b��
        }
        return -1;
    }
}