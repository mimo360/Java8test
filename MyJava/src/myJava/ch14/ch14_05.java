/*  �ɦW:ch14_05.java          �\��:TreeSet(Collection<? extends E> c)�غc�l  */

package myJava.ch14;
import java.lang.*;

import java.util.*;      //�ϥ�Collections Framework�����O�ݸ��J

public class ch14_05         //�D���O
{
    public static void main(String args[])
    {
        HashSet<Integer> objHS = new HashSet<Integer>();
        objHS.add(7);        objHS.add(3);
        objHS.add(6);        objHS.add(3);
        objHS.add(5);        objHS.add(6);        

        System.out.print("HashSet���X:");
        for (Integer hs : objHS)
            System.out.print(hs + "\t");
        System.out.println();    

        TreeSet<Number> objTS = new TreeSet<Number>(objHS);  //�غc�l���޼Ƭ����w���x���AobjHS���A�OHashSet<Integer>
        System.out.print("TreeSet���X:");
        for (Number ts : objTS)
            System.out.print(ts + "\t");
        System.out.println();
        System.out.println("----------------------------");  

        HashSet<String> objHSstr = new HashSet<String>();
        objHSstr.add("Pink");        objHSstr.add("Black");
        objHSstr.add("Green");       objHSstr.add("Blue");

        System.out.println("HashSet���X�ثe���e��:" + objHSstr);
        TreeSet<String> objTSstr = new TreeSet<String>(objHSstr);
        System.out.println("TreeSet���X�ثe���e��:" + objTSstr); 
    }
}