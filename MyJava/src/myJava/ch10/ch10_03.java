/*   �ɦW:ch10_03.java          �\��:�z�Lthrow�ԭz��X���بҥ~���O����  */

package myJava.ch10;
import java.lang.*;

public class ch10_03         //�D���O
{
    public static void main(String args[])
    {
    	   System.out.println("�o�@��|�Q����");
    	   int i=-2;
    	   if(i<0)
    	       throw new NegativeArraySizeException();
    	   //int ary[] = new int[i];
    	   System.out.println("�o�@�椣�|�Q����");    	        
    } 
}