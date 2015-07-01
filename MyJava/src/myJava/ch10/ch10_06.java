/*   �ɦW:ch10_06.java          �\��:��	Multi-catch������  */

package myJava.ch10;
import java.lang.*;

public class ch10_06         //�D���O
{
    public static void main(String args[])
    {
    	  int lottoSize=99;
    	
    	  try
    	  {   	   
    	    if(lottoSize > 48)
    	        throw new CmyException1();    	    
    	    else if(lottoSize < 6)
    	        throw new CmyException2();    	    
    	  }
    	  catch(CmyException1 | CmyException2 e)
    	  {
    	    e.showMessage();
    	    lottoSize = e.changeSize();
    	  }     	
    	  finally
    	  {
    	    System.out.println("�ֳz�}���y�Ƭ�" + lottoSize);
    	  }
    	
    	  int lottoAry[] = new int[lottoSize];
    	  System.out.println("�s��ֳz�}�����}�C���鲣�ͧ���");
    } 
}    

class CmyException1 extends Exception
{
    public CmyException1()   //�غc�l
    {
         super();
    }
    public void showMessage()
    {
         System.out.println("�ҥ~�T��:�}�C�j�p���~");
    }
    public int changeSize()
    {
         System.out.println("�ҥ~�T��:�}�C�j�p�N�Q���]��6");
         return 6;
    }
}


class CmyException2 extends Exception
{
    public CmyException2()   //�غc�l
    {
         super();
    }
    public void showMessage()
    {
         System.out.println("�ҥ~�T��:�}�C�j�p���~");
    }
    public int changeSize()
    {
         System.out.println("�ҥ~�T��:�}�C�j�p�N�Q���]��6");
         return 6;
    }
}
