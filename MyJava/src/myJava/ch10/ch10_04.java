/*  �ɦW:ch10_04.java          �\��:�z�Lthrow�ԭz��X�۩w�ҥ~���O����  */

package myJava.ch10;
import java.lang.*;

public class ch10_04         //�D���O
{
    public static void main(String args[]) throws CmyException
    {
        System.out.println("�o�@��|�Q����");
        int i=-2;
        if(i<0)
            throw new CmyException("�}�C�j�p�X�{�t��");
        int ary[] = new int[i];       //�o�@�椣�|�Q����
        System.out.println("�o�@�椣�|�Q����"); 	        
    } 
}

class CmyException extends Exception
{
    public CmyException()   //�غc�l
    {
        super();
    }
    public CmyException(String msg)   //�غc�l
    {
        super(msg);
    }    
}
