/*  �ɦW:ch14_08.java          �\��:HashMap<K,V>���O(��@Map<K,V>����)  */

package myJava.ch14;
import java.lang.*;

import java.util.*;      //�ϥ�Collections Framework�����O�ݸ��J

public class ch14_08         //�D���O
{
    public static void main(String args[])
    {    	    	
    	HashMap<Integer, String> objHM1 = new HashMap<>();
    	
    	System.out.print("Map�ثe����:" + objHM1.isEmpty());
    	System.out.println(" Map�ثe�@��" + objHM1.size() + "�Ӧ��露��");
    	
    	System.out.println("�[�Jkey=14002:" + objHM1.put(14002,"���p�M"));
    	System.out.println("�[�Jkey=14001:" + objHM1.put(14001,"���j��"));
    	System.out.println("�[�Jkey=14003:" + objHM1.put(14003,"���j��"));
    	
    	System.out.print("Map�ثe�@��" + objHM1.size() + "�Ӧ��露��");
    	System.out.println("  �ثe���e��:" + objHM1);
    	
    	//�л\�­� 
    	System.out.println("�[�Jkey=14002�л\�F�즳��:" + objHM1.put(14002,"�L�j�i"));
    	    	
    	System.out.print("Map�ثe�@��" + objHM1.size() + "�Ӧ��露��");
    	System.out.println("  �ثe���e��:" + objHM1);   	
    	
    	System.out.print("�����key=14003�������Ȭ�:");
    	System.out.println(objHM1.get(14003));
    	System.out.print("Map���O�_�]�t�����key=14004������:");
    	System.out.println(objHM1.containsKey(14004));
    	System.out.print("Map���O�_�]�t�����key=14002������:");
    	System.out.println(objHM1.containsKey(14002));
    	System.out.print("Map���O�_�]�t������vlaue=���j�ت�����:");
    	System.out.println(objHM1.containsValue("���j��"));
    	
    	//�л\�­�
    	System.out.println("�[�Jkey=14001:" + objHM1.put(14001,"���j��"));
    	System.out.print("Map�ثe�@��" + objHM1.size() + "�Ӧ��露��");
    	System.out.println("  �ثe���e��:" + objHM1);
    	
    	Set<Integer> objSet = objHM1.keySet();
    	System.out.println("�Ǹ����X���e��:" + objSet);
    	Collection<String> objCol = objHM1.values();
    	System.out.println("�m�W���X���e��:" + objCol);
    	
    	System.out.println("����key=14003:" + objHM1.remove(14003));
    	System.out.print("Map�ثe�@��" + objHM1.size() + "�Ӧ��露��");
    	System.out.println("  �ثe���e��:" + objHM1);
    } 
}