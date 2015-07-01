/*  �ɦW:ch14_12.java          �\��:ListIterator<E>����  */

package myJava.ch14;
import java.lang.*;

import java.util.*;      //�ϥ�Collections Framework�����O�ݸ��J

public class ch14_12         //�D���O
{
    public static void main(String args[])
    {    	
    	
    	LinkedList<Integer> objLList1 = new LinkedList<>(); //���X������Integer
    	
    	objLList1.add(24);  objLList1.add(17);  objLList1.add(41);
    	objLList1.add(18);  objLList1.add(30);  objLList1.add(12);   	
    	    	
    	int len=objLList1.size();
    	System.out.print("���X�ثe���׬�:" + len);
    	System.out.println("  ���X�ثe���e��:" + objLList1); 	
    	    	
    	ListIterator<Integer> objListItr1 = objLList1.listIterator();  //�����]�w�ۦP�x��Integer   
    	ListIterator<Integer> objListItr2 = objLList1.listIterator(len);  //�����]�w�ۦP�x��Integer  
    	
    	System.out.print("���V���X:");
    	while(objListItr1.hasNext())
    	{
            System.out.print(objListItr1.next() + " ");
    	}
    	System.out.println();    	
    	
    	System.out.print("�ϦV���X:");
    	while(objListItr2.hasPrevious())
    	{
            System.out.print(objListItr2.previous() + " ");
    	}
    	System.out.println();
    } 	
}