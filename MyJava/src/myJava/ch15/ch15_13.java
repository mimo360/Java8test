/*   �ɦW:ch15_13.java       �\��:���Ψ�Ʀ�������Lambda�B�⦡  */

package myJava.ch15;
import java.lang.*;

@FunctionalInterface interface IDuplicate //��Ʀ�����
{
    String duplicateOperation(String str);
}

interface ITrans        //�o�]�O��Ʀ�����
{
    String transOperation(String str);
}

public class ch15_13         //�D���O
{    
    public static void main(String[] args)
    {
        CPrint objA = new CPrint();

        System.out.println("�L�X�@�q���ơA�����ťաA���ର�j�g����r");   
        objA.printDupBig("HelloLambda"
                         , (String s) -> s + " " + s 
                         , (String s) -> s.toUpperCase()
                         );         
    }
}

class CPrint
{
    public void printDupBig(String s1,IDuplicate obj1,ITrans obj2)
    {         
         s1 = obj1.duplicateOperation(s1);   //�I�s��k���ڭ̰���
         s1 = obj2.transOperation(s1);       //�I�s��k���ڭ̰���
         System.out.println(s1);
    }
    
    public String printSmall(String s1,ITrans obj)  //��@���D
    {
        s1 = obj.transOperation(s1);         //�I�s��k���ڭ̰���
        return s1;
    }
}