/*  �ɦW:ch14_07.java          �\��:ArrayList<E>���O(��@List<E>����)  */

package myJava.ch14;
import java.lang.*;

import java.util.*;      //�ϥ�Collections Framework�����O�ݸ��J

public class ch14_07         //�D���O
{
  public static void main(String args[])
  {    	
      ArrayList<Integer> objAryList1 = new ArrayList<>(); //���X������Integer
    	    	
      System.out.println("\t\t\t�ثe�}�C���e��" + objAryList1);
      objAryList1.add(25);  objAryList1.add(18);  objAryList1.add(41);
      objAryList1.add(48);  objAryList1.add(30);  objAryList1.add(12); 
      System.out.println("�[�J������,\t\t�ثe�}�C���e��" + objAryList1);
    	    	
      objAryList1.set(3,10); 
      System.out.print("�w�N����3�������]�w��10");
      System.out.println(" �ثe�}�C���e��" + objAryList1); 
    	
      objAryList1.remove(2);              //�������ެ�2������
      System.out.print("�w�N��l����2�������R��");
      System.out.println(" �ثe�}�C���e��" + objAryList1); 
      System.out.println("����30�����ެ�" + objAryList1.indexOf(30));
  }    
}