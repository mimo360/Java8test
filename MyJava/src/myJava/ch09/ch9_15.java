/*   �ɦW:ch9_15.java          �\��:instanceof�B��l   */

package myJava.ch09;
import java.lang.*;

public class ch9_15         //�D���O
{
    public static void main(String args[])
    {
        CA objA = new CA();       //obj1��CA���O������
        CB objB = new CB();       //obj2��CB���O������
        CC objC = new CC();       //obj2��CB���O������
    	//----------------------------------------------------------
        if (objA instanceof CA)
            System.out.println("objA�֦��@��CA���O������");
        if (objB instanceof CA)
            System.out.println("objB�֦��@��CA���O������");
        if (objC instanceof CA)
            System.out.println("objC�֦��@��CA���O������");
        if (objA instanceof CC)                       //��false
            System.out.println("objA�֦��@��CC���O������");    	    
        if (objB instanceof IA)
            System.out.println("objB�֦��@��IA��������@����");
    } 
}    

interface IA              //�w�q����
{    
    public static final int var1=5;
}

class CA implements IA   // ���OCA��@�ɭ�IA
{
    public int var2;    
}

class CB extends CA   // ���OCB�~��CA
{
    public int var3;    
}

class CC extends CB   // ���OCC�~��CB
{
    public int var4;    
}
