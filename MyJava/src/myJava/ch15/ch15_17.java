/*  �ɦW:ch15_15.java          �\��:lambda�B�⦡������  */

package myJava.ch15;
import java.lang.*;

@FunctionalInterface  interface IMyFI
{
    void testAB();    //��H��k
    default int def(int a , int b)  //�w�]��k
    {
        return a + b;
    }
}

public class ch15_17       //�D���O
{
    private int x = 15;
    private static int y = 35;

    public static void main(String[] args)
    {
          ch15_17 objA = new ch15_17();
          objA.test();
    }

    public void test()
    {
        String localVar1 = "abc";
        String localVar2 = "xyz";

        IMyFI obj = ()->{    //�o��lambda�ΨӶ��testAB()���{���X
            System.out.println("localVar1:"  + localVar1);     //�iŪ��effectively final�ϰ��ܼ�

            //localVar2 = "ijk";                               //�blambda�����i�ק�ϰ��ܼ�

            x = x+10;
            y = y+10;
            System.out.println("�~�����O�������ܼ�x:"  + x);
            System.out.println("�~�����O�����O�ܼ�y:"  + y);

            //System.out.println(def(5,7));       //�blambda���L�k�I�s�w�]��k
        };

        obj.testAB();        
        System.out.println(obj.def(5,7));        //�blambda���~�i�H�I�s�w�]��k    
    }
}
