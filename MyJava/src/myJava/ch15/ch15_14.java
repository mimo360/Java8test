/*   �ɦW:ch15_14.java       �\��:Lambda�B�⦡����treturn  */

package myJava.ch15;
import java.lang.*;

interface IMyMath
{
    boolean isPositive(int x);
}

public class ch15_14         //�D���O
{
    public void printAbs(int n,IMyMath obj)
    {
        if(obj.isPositive(n)==false)
           System.out.println(n + "������Ȭ�" + (n*-1));
        else
           System.out.println(n + "������Ȭ�" + n);
    }

    public static void main(String[] args)
    {
        ch15_14 objA = new ch15_14();
        objA.printAbs(-3, (int x) ->
                          {
                             if(x<0)   return false;
                             return true;
                          }  );        
    }
}




