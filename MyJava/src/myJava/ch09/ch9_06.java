/*   �ɦW:ch9_06.java         �\��:�ѨM�h�Ӥ����Ĭ𪺹w�]��k  */

package myJava.ch09;
import java.lang.*;

public class ch9_06         //�D���O
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

class CA implements IX,IY   //��@��Ӥ���
{
   public void show()       //�@�w�n��gshow()��k
   {
         IY.super.show();
   }  
}