/*  �ɦW:ch15_20.java          �\��:lambda�B�⦡�P���O�����k�Ѧ�  */

package myJava.ch15;
import java.lang.*;

@FunctionalInterface interface IFIABS{
    int abs(CABS obj,int a);
}

public class ch15_20       //�D���O
{
    public static void main(String[] args)
    {
          ch15_20 objA = new ch15_20();
          objA.test();
    }

    public void test()
    {
        IFIABS obj1 = (CABS o,int i) ->  o.myabs(i);  //��檺lambda                     
        System.out.println(obj1.abs(new CABS(),-4));

        IFIABS obj2 = CABS::myabs;                 //���O�����k�Ѧ�              
        System.out.println(obj2.abs(new CABS(),-3));  
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

