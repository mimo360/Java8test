/*  �ɦW:ch14_10.java          �\��:Iterator����  */

package myJava.ch14;
import java.lang.*;

import java.util.*;      //�ϥ�Collections Framework�����O�ݸ��J

public class ch14_10         //�D���O
{
    public static void main(String args[])
    {
    	
        TreeSet<Integer> objTS1 = new TreeSet<>(); 
    	
        objTS1.add(15);  objTS1.add(18);  objTS1.add(14);
        objTS1.add(37);  objTS1.add(20);  objTS1.add(6);
    	    	
        System.out.print("���X�ثe���׬�:" + objTS1.size()); 	
        System.out.println("  ���X�ثe���e��:" + objTS1); 	
    	    	
        Iterator<Integer> objItr1 = objTS1.iterator();  //�����]�w�ۦP�x��Integer  
        while(objItr1.hasNext())
        {
            System.out.print(objItr1.next() + " ");
        }
        System.out.println();
        objItr1.remove();
    	
        System.out.print("���X�ثe���׬�:" + objTS1.size());   	
        System.out.println("  ���X�ثe���e��:" + objTS1);   	
    } 	
}