/*   �ɦW:ch9_08.java         �\��:�~�Ӧh�Ӥ�����g�Ĭ𪺹w�]��k  */

package myJava.ch09;
import java.lang.*;

public class ch9_08         //�D���O
{
    public static void main(String args[])
    {
        CA obj = new CA();
        obj.show();          
    } 
}    

interface IX        //�w�q����
{
    public default void show()
    {
         System.out.println("IX default");
    }
}

interface IY        //�w�q����
{
    public default void show()
    {
         System.out.println("IY default");
    }
}

interface IZ extends IX,IY
{
   public default void show()       //�@�w�n��gshow()��k�A�_�h�N�n�N���A�ŧi����H��k
   {
         IY.super.show();
   } 
}

class CA implements IZ  //��@IZ
{     
}