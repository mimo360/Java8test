/*  �ɦW:ch14_11.java          �\��:Iterator����  */

package myJava.ch14;
import java.lang.*;

import java.util.*;      //�ϥ�Collections Framework�����O�ݸ��J

public class ch14_11         //�D���O
{
    public static void main(String args[])
    {
    	
        TreeSet<Integer> objTS1 = new TreeSet<>(); 
    	
        objTS1.add(15);  objTS1.add(18);  objTS1.add(14);
        objTS1.add(37);  objTS1.add(20);  objTS1.add(6);
    	
        //�ĥ|�p������18    	
        System.out.print("���X�ثe���׬�:" + objTS1.size()); 	
        System.out.println("  ���X�ثe���e��:" + objTS1); 	
    	    	
        Iterator<Integer> objItr1 = objTS1.iterator();  //�����]�w�ۦP�x��Integer  
        for(int i=1;i<=4;i++)    	
            objItr1.next();     	
        objItr1.remove();    	
        System.out.print("���X�ثe���׬�:" + objTS1.size());   	
        System.out.println("  ���X�ثe���e��:" + objTS1);   	
    } 	
}