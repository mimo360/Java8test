/*  �ɦW:ch6_14.java       �\��:sort�PbinarySearch��k   */

package myJava.ch06;
import java.lang.*;
import java.util.Scanner;
import java.util.Arrays;          //sort�PbinarySearch���ݩ�����O



public class ch6_14         //�D���O
{
    public static void main(String args[])
    {
        int workArr[]={43,23,67,27,39,15,39,37,57,26,14};
        int findNum,location;
        Scanner keyboardInput = new Scanner(System.in);
 
        Arrays.sort(workArr);                      //��}�C�Ƨ�
        System.out.print("�п�J�z�n�䪺�ƭ�:");
        findNum = Integer.parseInt(keyboardInput.nextLine());
        location = Arrays.binarySearch(workArr,findNum); //��}�C�i��G���j�M
        if(location<0)
           System.out.println("�b�}�C���䤣��n�䪺�ƭ�");
        else
           System.out.println("�ƭȦs�b��}�C��");
    }   
}