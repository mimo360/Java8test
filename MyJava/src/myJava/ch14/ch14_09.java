/*  �ɦW:ch14_09.java          �\��:TreeMap<K,V>���O(��@Map<K,V>������SortedMap<K,V>����)  */

package myJava.ch14;
import java.lang.*;
import java.io.*;
import java.util.*;      //�ϥ�Collections Framework�����O�ݸ��J

public class ch14_09         //�D���O
{
    public static void main(String args[])
    {    	    	
    	TreeMap<Integer, String> objTM1 = new TreeMap<>();
    	
    	System.out.print("TreeMap�ثe����:" + objTM1.isEmpty());
    	
    	objTM1.put(14007,"���p�M");
    	objTM1.put(14004,"���j��");
    	objTM1.put(14002,"���j��");
    	objTM1.put(14006,"�L�j�i");
    	
    	System.out.println("TreeMap�ثe�@��" + objTM1.size() + "�Ӥ���");
    	System.out.println("�ثe���e��:" + objTM1);
    	
    	System.out.print("�Ĥ@�Ӥ�����   " + objTM1.firstKey());
    	System.out.println(" " + objTM1.get(objTM1.firstKey()));
    	System.out.print("�̫�@�Ӥ����� " + objTM1.lastKey());
    	System.out.println(" " + objTM1.get(objTM1.lastKey()));
    	System.out.print("��14005�j���̤p����Ȭ�");
    	System.out.println(objTM1.higherKey(14005));
    	System.out.print("��14005�p���̤j����Ȭ�");
    	System.out.println(objTM1.lowerKey(14005));
    	System.out.print("����14004(�t)~14007(���t)���lTreeMap��:");
    	System.out.println(objTM1.subMap(14004,14007));    	
    } 
}