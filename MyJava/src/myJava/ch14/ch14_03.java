/*  �ɦW:ch14_03.java          �\��:HashSet���O(��@Set����)  */

package myJava.ch14;
import java.lang.*;

import java.util.*;      //�ϥ�Collections Framework�����O�ݸ��J

public class ch14_03         //�D���O
{
    public static void main(String args[])
    {
        String str1 = new String("Green");
        String str2 = "Red";
    	
        HashSet<String> objHS1 = new HashSet<>(); //���X������String
    	
        System.out.print("���X1�ثe����:" + objHS1.isEmpty());
        System.out.println("    ���X1�ثe���׬�:" + objHS1.size());
    	
        System.out.println("�[�JGreen�O�_���\:" + objHS1.add(str1));
        System.out.println("�[�JRed  �O�_���\:" + objHS1.add(str2));
        System.out.println("�[�JBlue �O�_���\:" + objHS1.add("Blue"));
        System.out.println("�[�JRed  �O�_���\:" + objHS1.add("Red")); //�|����
    	
        System.out.print("���X1�ثe���׬�:" + objHS1.size());   	
        System.out.println("  ���X1�ثe���e��:" + objHS1);
   	
        System.out.println("���X1�O�_�]�tRed :" + objHS1.contains(str2));
        System.out.println("���X1�O�_�]�tBlue:" + objHS1.contains("Blue"));
        System.out.println("���X1�O�_�]�tPink:" + objHS1.contains("Pink"));

        System.out.println("����Red �O�_���\:" + objHS1.remove("Red"));
        System.out.println("����Pink�O�_���\:" + objHS1.remove("Pink"));
        
        System.out.print("���X1�ثe���׬�:" + objHS1.size());   	
        System.out.println("  ���X1�ثe���e��:" + objHS1);
   	
        System.out.println("���X1�O�_�]�tRed :" + objHS1.contains("Red"));
    	
        System.out.println("-----------------------------------");
    	
        HashSet<String> objHS2 = new HashSet<>();  //���X������String
        objHS2.add("Pink"); objHS2.add("Blue"); objHS2.add("Black"); 
    	
        System.out.print("���X2�ثe���׬�:" + objHS2.size());   	
        System.out.println("  ���X2�ثe���e��:" + objHS2);
    	
        objHS2.addAll(objHS1);    //��objHS1�������[�J��objHS2
    	
        System.out.print("���X2�ثe���׬�:" + objHS2.size());   	
        System.out.println("  ���X2�ثe���e��:" + objHS2);    	
    }
}