/*   �ɦW:ch14_17.java       �\��:��@Comparator<? super CStu>����  */

package myJava.ch14;
import java.lang.*;
import java.util.*;      //�ϥ�Collections Framework�����O�ݸ��J

public class ch14_17         //�D���O
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
        
        CMyComparator1 objComp1= new CMyComparator1();  //�ƧǨ̾�1
        Collections.sort(objLList1,objComp1);    //�ϥαƧǨ̾�1�i��Ƨ�       
        
        ListIterator<CStu> objListItr1 = objLList1.listIterator();
        System.out.println("�Ǹ����W���:");
        while(objListItr1.hasNext())
        {
            objListItr1.next().showData();
        }

        CMyComparator2 objComp2= new CMyComparator2();  //�ƧǨ̾�2
        Collections.sort(objLList1,objComp2);    //�ϥαƧǨ̾�2�i��Ƨ�
        
        ListIterator<CStu> objListItr2=objLList1.listIterator();        
        System.out.println("���Z���W���:");
        while(objListItr2.hasNext())
        {
            objListItr2.next().showData();
        }
    } 
}

class CMyComparator1 implements Comparator<Object>  //��@Comparator����
{
   public int compare(Object o1,Object o2)
   {
       if(o1 instanceof CStu && o2 instanceof CStu)
       {
          if(((CStu)o1).id < ((CStu)o2).id)
           return -1;
         else if(((CStu)o1).id == ((CStu)o2).id)
           return 0;
         else if(((CStu)o1).id > ((CStu)o2).id)
           return 1;         
       }
       return 0;    
   }
}

class CMyComparator2 implements Comparator<CStu> //��@Comparator����
{
   public int compare(CStu o1,CStu o2)
   {
       if(o1.score < o2.score)
           return -1;
       else if(o1.score == o2.score)
           return 0;
       else if(o1.score > o2.score)
           return 1;       
       return 0;    
   } 
}    

class CStu
{
   public int id;
   public String name;
   public int score;
   public CStu(int i,String j,int k){id = i; name = j; score = k;}
   public void showData()
   {
       System.out.print("�Ǹ�:" + id);
       System.out.print("\t�m�W:" + name);
       System.out.println("\t���Z:" + score);
   }
}


