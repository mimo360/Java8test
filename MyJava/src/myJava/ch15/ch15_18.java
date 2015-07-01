/*  �ɦW:ch15_18.java          �\��:lambda�B�⦡�P�R�A��k�Ѧ�  */

package myJava.ch15;
import java.lang.*;

@FunctionalInterface interface IFIABS{
    int abs(int a);
}

public class ch15_18       //�D���O
{
    public static void main(String[] args)
    {
          ch15_18 objA = new ch15_18();
          objA.test();
    }

    public void test()
    {
        IFIABS obj1 = (int i) ->                  //�h�檺lambda 
                      {
                         if(i<0) return (-1)*i;
                         return i;
                      };
        System.out.println(obj1.abs(-5));

        IFIABS obj2 = (int i) ->  CABS.myabs(i);  //��檺lambda                     
        System.out.println(obj2.abs(-4));

        IFIABS obj3 = CABS::myabs;                //�R�A��k�Ѧ�              
        System.out.println(obj3.abs(-3)); 
    }
}

class CABS
{
    public static int myabs(int x)
    {   
         if(x<0) return (-1)*x;
         return x;
    }
}

