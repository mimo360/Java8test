/*  �ɦW:ch15_21.java          �\��:lambda�B�⦡�P�غc�l�Ѧ�  */

package myJava.ch15;
import java.lang.*;

@FunctionalInterface interface IFIABS{
    CABS abs(int a);
}

public class ch15_21       //�D���O
{
    public static void main(String[] args)
    {
          ch15_21 objA = new ch15_21();
          objA.test();
    }

    public void test()
    {
        IFIABS obj1 = (int i) ->  new CABS(i);    //��檺lambda
        CABS o1 = obj1.abs(-4);
        System.out.println(o1.positiveNum);

        IFIABS obj2 = CABS::new;                  //�غc�l�Ѧ�              
        CABS o2 = obj2.abs(-3);
        System.out.println(o2.positiveNum);
    }
}

class CABS
{
    public int positiveNum;
    public CABS(int x)             //�غc�l
    {   
         if(x<0) positiveNum = (-1)*x;
         else positiveNum = x;
    }
}

