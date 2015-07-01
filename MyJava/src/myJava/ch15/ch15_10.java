/*   �ɦW:ch15_10.java       �\��:�ΰΦW���OComparator  */

package myJava.ch15;
import java.lang.*;
import java.util.*;      //�ϥ�Collections Framework�����O�ݸ��J

public class ch15_10         //�D���O
{
    public static void main(String args[])
    {        
        LinkedList<String> objLList1 = new LinkedList<String>();

        objLList1.add("abcdefg");  objLList1.add("abc");
        objLList1.add("xy");       objLList1.add("ijklm");  
        
        System.out.println(objLList1);
        Collections.sort(objLList1,
                        new Comparator<String>(){
                                      public int compare(String o1,String o2)
                                      {
                                         if(o1.length() < o2.length())
                                              return -1;
                                          else if(o1.length() > o2.length())
                                              return 1;
                                          else 
                                              return 0;       
                                      } 
                                   });
        System.out.println(objLList1);
    }
}