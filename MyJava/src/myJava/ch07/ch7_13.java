/*   �ɦW:ch7_13.java        �\��:���󪺤��   */

package myJava.ch07;
import java.lang.*;

public class ch7_13         //�D���O
{
    public static void main(String args[])
    {
        CMyClass X = new CMyClass(5);
        CMyClass Y = new CMyClass(5);
        CMyClass Z = X;
        System.out.print("����X�P����Y  ");
        X.compare2Obj(Y);
        System.out.print("����X�P����Z  ");
        X.compare2Obj(Z);
    } 
}    

class CMyClass
{
    private int Var;
    public CMyClass(){}       //�}�n���ߺD�O�ɤW�@�ӨS���Ѽƪ��غc�禡
    public CMyClass(int i)    //�@�Ӿ�ưѼƪ��غc�禡
    {
        Var = i;       
    }
    
    public void compare2Obj(CMyClass Obj)
    {
        if(this==Obj)
           System.out.println("�⪫��۵�");
        else
           System.out.println("�⪫�󤣬۵�");        
    }
}