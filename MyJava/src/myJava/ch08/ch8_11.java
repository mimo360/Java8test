/*  �ɦW:ch8_11.java        �\��:getClass() method  */

package myJava.ch08;
import java.lang.*;

public class ch8_11         //�D���O
{
    public static void main(String args[])
    {
        CMyClass X = new CMyClass();
        Class Y;
        Y=X.getClass();
        System.out.println("X�ݩ�" + Y +"������");
        String str = new String("..");
        Y = str.getClass();
        System.out.println("str�ݩ�" + Y +"������");        
    } 
}    

class CMyClass
{
    private int var;    
}