/*   �ɦW:ch7_12.java        �\��:this�����e  */

package myJava.ch07;
import java.lang.*;

public class ch7_11         //�D���O
{
                     
    public static void main(String args[])
    {         
         CMyClass X = new CMyClass();
         CMyClass Y = new CMyClass();
         System.out.print("X�������Ҧb��}=");
         X.show_this();         
         System.out.print("Y�������Ҧb��}=");
         Y.show_this();
    }
}

class CMyClass
{
    public int var=10;    //�����ܼ� 
    public void show_this()
    {
        System.out.println(this);
    }
}    