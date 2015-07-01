/*  �ɦW:ch14_06.java         �\��:LinkedList<E>���O(��@List<E>����)  */

package myJava.ch14;
import java.lang.*;

import java.util.*;      //�ϥ�Collections Framework�����O�ݸ��J

public class ch14_06         //�D���O
{
    public static void main(String args[])
    {
    	
        LinkedList<Integer> objLList1 = new LinkedList<>(); //���X������Integer
    	
        objLList1.add(25);  objLList1.add(18);  objLList1.add(41);
        objLList1.add(18);  objLList1.add(30);  objLList1.add(12);
    	   	
        showList(objLList1);  
        System.out.println("�Ĥ@��12�����ޭȬ�" + objLList1.indexOf(12));  	
        System.out.println("�Ĥ@�Ӥ�����:" + objLList1.getFirst()); //�i������peekFirst
        System.out.println("�̫�@�Ӥ�����:" + objLList1.getLast());//�i������peekLast
        System.out.print("���\�R���e��Ĥ@��18:");
        System.out.println(objLList1.removeFirstOccurrence(18));
        System.out.print("���\�R���e��Ĥ@��12:");
        System.out.println(objLList1.removeFirstOccurrence(12));
        showList(objLList1);
        System.out.println("�R���Ĥ@�Ӥ�����:" + objLList1.pollFirst());
        showList(objLList1);
        System.out.println("�Ĥ@��12�����ޭȬ�" + objLList1.indexOf(12));    	    	
    }
    public static void showList(LinkedList objLList)
    {
        System.out.print("LinkedList�ثe���׬�:" + objLList.size());
        System.out.print("   ��C�ثe��:");
        for(int i=0;i<objLList.size();i++)
           System.out.print(objLList.get(i) + " ");
        System.out.println();  
    }
}