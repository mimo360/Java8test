/* �ɦW:ch14_15.java     �\��:Collections���O��sort��k */

package myJava.ch14;
import java.lang.*;
import java.util.*;      //�ϥ�Collections Framework�����O�ݸ��J

public class ch14_15         //�D���O
{
    public static void main(String args[])
    {    	
    	LinkedList<Integer> objLList1 = new LinkedList<Integer>();    	
    	objLList1.add(24);  objLList1.add(17);  objLList1.add(41);
    	objLList1.add(18);  objLList1.add(30);  objLList1.add(12);
    	
    	System.out.println("���S�O�����~,�j�ֳz�}�����X�O:" + objLList1);
    	    	
    	Collections.sort(objLList1);   //�露���Ƨ�
    	System.out.println("         �Ѥp�j��ƧǪ����X�O:" + objLList1);
    } 	
}