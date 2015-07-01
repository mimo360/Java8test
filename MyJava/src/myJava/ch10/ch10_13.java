/*  �ɦW:ch10_13.java          �\��:Precise rethrow with a final Exception    */

package myJava.ch10;
import java.lang.*;
import java.util.Scanner;

public class ch10_13         //�D���O
{
    public static void main(String args[]) 
    {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("�п�J�}�C�j�p:");
        int lottoSize=0;
        CmyClass1 obj1 = new CmyClass1();

        try
        {   	   
            lottoSize = obj1.check(keyboardInput.nextLine());   //�i��|���ͨҥ~         
        }        
        catch(CmyException1 e)
        { 
            System.out.println("�ҥ~�T��:�y�ƹL�j�A���]��6");
            lottoSize = 6;
        }
        catch(CmyException2 e)
        { 
            System.out.println("�ҥ~�T��:�y�ƹL�p�A���]��6");
            lottoSize = 6;
        }    	
        catch(NumberFormatException e)
        {
            System.out.println("�y�Ƥ����Ʀr,�N�Q�]�w��6�y");
            lottoSize = 6;
        } 
        catch(Exception e)
        {
            System.out.println("�ҥ~�T��:���ͨ�L�ҥ~���B�z");
        }       	
        finally
        {
            System.out.println("�ֳz�}���y�Ƭ�" + lottoSize);
        }
    	
        int lottoAry[] = new int[lottoSize];
        System.out.println("�s��ֳz�}�����}�C���鲣�ͧ���");
    } 
}    

class CmyClass1
{
    private int lottoSize;         
    public int check(String inputStr) 
               throws CmyException1,CmyException2,NumberFormatException
    {
      try 
      {
            lottoSize = Integer.parseInt(inputStr);     
            if(lottoSize > 48)
                 throw new CmyException1("�ҥ~�T��:�}�C�Ӥj"); 
            else if(lottoSize < 6)
                 throw new CmyException2("�ҥ~�T��:�}�C�Ӥp"); 
            return lottoSize;  
     }
      catch(final Exception e)
      {
            throw e;
      }     
    }   
}

class CmyException1 extends Exception
{
    public CmyException1() { super(); } //�غc�l
    public CmyException1(String msg)   //�غc�l
    {
        super();
        System.out.println(msg);
    }        
}

class CmyException2 extends Exception
{
    public CmyException2(){ super(); } //�غc�l
    public CmyException2(String msg)   //�غc�l
    {
        super();
        System.out.println(msg);
    }     
}
