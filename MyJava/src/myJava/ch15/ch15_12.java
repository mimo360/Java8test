/*   �ɦW:ch15_12.java       �\��:��Lambda�B�⦡���N�ΦW���O  */

package myJava.ch15;
import java.lang.*;
import java.util.*;      //�ϥ�Collections Framework�����O�ݸ��J

public class ch15_12         //�D���O
{
    public static void main(String args[])
    {        
        LinkedList<String> objLList1 = new LinkedList<String>();

        objLList1.add("abcdefg");  objLList1.add("abc");
        objLList1.add("xy");       objLList1.add("ijklm");  
        
        System.out.println(objLList1);
        Collections.sort(objLList1, 
                         (o1,o2) -> Integer.compare(o1.length(),o2.length())
                        );
        System.out.println(objLList1);
    }
}