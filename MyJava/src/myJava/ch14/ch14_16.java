/*   �ɦW:ch14_16.java       �\��:�ϥ�LinkedList<CStu>�s��CStu����   */

package myJava.ch14;
import java.lang.*;
import java.util.*;      //�ϥ�Collections Framework�����O�ݸ��J

public class ch14_16         //�D���O
{
    public static void main(String args[])
    {        
        LinkedList<CStu> objLList1 = new LinkedList<CStu>();
        
        CStu obj1 = new CStu(14007,"���p�M",85);
        CStu obj2 = new CStu(14004,"���j��",87);
        CStu obj3 = new CStu(14002,"���j��",75);
        CStu obj4 = new CStu(14006,"�L�j�i",92);
        
        objLList1.add(obj1);  objLList1.add(obj2);
        objLList1.add(obj3);  objLList1.add(obj4);
        
        //System.out.println("���X���e��:" + objLList1);
        
        ListIterator<CStu> objListItr1 = objLList1.listIterator();
        
        System.out.println("���V���X:");
        while(objListItr1.hasNext())
        {
            objListItr1.next().showData();
        }                
        //Collections.sort(objLList1);   //�L�k�Ƨ�        
    }     
}

class CStu
{
   int id;
   String name;
   int score;
   public CStu(int i,String j,int k){id = i; name = j; score = k;}
   public void showData()
   {
       System.out.print("�Ǹ�:" + id);
       System.out.print("\t�m�W:" + name);
       System.out.println("\t���Z:" + score);
   }
}