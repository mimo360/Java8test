/*   �ɦW:ch8_10.java        �\��:���󪺤��   */

package myJava.ch08;
import java.lang.*;

public class ch8_10         //�D���O
{
    public static void main(String args[])
    {
        CMyClass X = new CMyClass(5);
        CMyClass Y = new CMyClass(5);
        CMyClass Z = X;
        System.out.print("����X�P����Y  ");
        if(X.equals(Y))
           System.out.println("�⪫��۵�");
        else
           System.out.println("�⪫�󤣬۵�");  
        System.out.print("����X�P����Z  ");
        if(X.equals(Z))
           System.out.println("�⪫��۵�");
        else
           System.out.println("�⪫�󤣬۵�");
    } 
}    

class CMyClass
{
    private int Var;
    public CMyClass(){}     
    public CMyClass(int i)  
    {
        Var = i;       
    }
}