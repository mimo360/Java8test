/*  �ɦW:ch14_14.java          �\��:ListIterator<E>����  */

package myJava.ch14;
import java.lang.*;

import java.util.*;      //�ϥ�Collections Framework�����O�ݸ��J

public class ch14_14         //�D���O
{
    public static void main(String args[])
    {    	
    	
    	LinkedList<Integer> objLList1 = new LinkedList<>(); 
    	
    	objLList1.add(24);  objLList1.add(17);  objLList1.add(41);
    	objLList1.add(18);  objLList1.add(30);  objLList1.add(12);
    	    	
    	System.out.print("���X�ثe���׬�:" + objLList1.size());
    	System.out.println("  ���X�ثe���e��:" + objLList1); 	
    	    	
    	ListIterator<Integer> objListItr1 = objLList1.listIterator(4); 
    	System.out.println("ListItr1���W�@�Ӥ�����:" + objListItr1.previous());
    	
    	objListItr1.add(40);
    	System.out.println("�w���J�@�Ӥ���40");
    	System.out.print("���X�ثe���׬�:" + objLList1.size());
    	System.out.println("  ���X�ثe���e��:" + objLList1); 	
    	
    	objListItr1.previous();
    	objListItr1.previous();
    	System.out.println("�w���e���ʨ�Ӥ���");
    	
    	objListItr1.remove();    //objListItr1.set(25);
    	System.out.println("�w�R���@�Ӥ���");
    	
    	System.out.print("���X�ثe���׬�:" + objLList1.size());
    	System.out.println("  ���X�ثe���e��:" + objLList1); 	
    } 	
}