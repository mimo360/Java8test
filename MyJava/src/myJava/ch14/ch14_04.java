/*  �ɦW:ch14_04.java    �\��:TreeSet���O(��@Set������SortedSet����)  */

package myJava.ch14;
import java.lang.*;

import java.util.*;      //�ϥ�Collections Framework�����O�ݸ��J

public class ch14_04         //�D���O
{
    public static void main(String args[])
    {
    	
        TreeSet<Integer> objTS1 = new TreeSet<>(); //���X������Integer
    	
        objTS1.add(15);  objTS1.add(18);  objTS1.add(14);
        objTS1.add(37);  objTS1.add(20);  objTS1.add(6);
        System.out.println("�[�J15�O�_���\:" + objTS1.add(15)); //�|����
    	
        System.out.print("���X�ثe���׬�:" + objTS1.size());   	
        System.out.println("  ���X�ثe���e��:" + objTS1); 	
    	    	
        System.out.println("�Ĥ@�Ӥ�����" + objTS1.first());
        System.out.println("�̫�@�Ӥ�����" + objTS1.last());
        System.out.println("��15�j���̤p������" + objTS1.higher(15));
        System.out.println("��15�p���̤j������" + objTS1.lower(15));
        System.out.print("����15(�t)~20(���t)���l���X��:");
        System.out.println(objTS1.subSet(15,20));
    	
        System.out.println("-----------------------------------");
        System.out.println("�����̤p����" + objTS1.pollFirst());
        System.out.println("�����̤j����" + objTS1.pollLast());
        System.out.print("���X�ثe���׬�:" + objTS1.size());   	
        System.out.println("  ���X�ثe���e��:" + objTS1);
    } 
}