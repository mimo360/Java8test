/*  �ɦW:ch15_19.java          �\��:lambda�B�⦡�P��������k�Ѧ�  */

package myJava.ch15;
import java.lang.*;

@FunctionalInterface interface IFIABS{
    int abs(int a);
}

public class ch15_19       //�D���O
{
    public static void main(String[] args)
    {
          ch15_19 objA = new ch15_19();
          objA.test();
    }

    public void test()
    {
        CABS objAbs = new CABS();                 //���ͤ@�Ӫ������

        IFIABS obj1 = (int i) ->  objAbs.myabs(i);  //��檺lambda                     
        System.out.println(obj1.abs(-4));

        IFIABS obj2 = objAbs::myabs;              //��������k�Ѧ�              
        System.out.println(obj2.abs(-3)); 
    }
}

class CABS
{
    public int myabs(int x)
    {   
         if(x<0) return (-1)*x;
         return x;
    }
}

