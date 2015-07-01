/*   �ɦW:ch10_05.java          �\��:�ۭq�ҥ~�B�z�PMulti-catch  */

package myJava.ch10;
import java.lang.*;
import java.util.Scanner;

public class ch10_05         //�D���O
{
    public static void main(String args[])
    {
       Scanner keyboardInput = new Scanner(System.in);
       System.out.print("�п�J�}�C�j�p:");
       int lottoSize=0;
       
       try
       {         
           lottoSize = Integer.parseInt(keyboardInput.nextLine());        
           if(lottoSize > 48)
               throw new CmyException1("�ҥ~�T��:�}�C�Ӥj");           
           else if(lottoSize < 6)
               throw new CmyException2("�ҥ~�T��:�}�C�Ӥp");           
       }
       catch(CmyException1 | CmyException2 e)
       {   //���׬OCmyException1��CmyException2�������ҥ~�A������U�C�ʧ@          
            System.out.println("�ҥ~�T��:�}�C�j�p�N�Q���]��6");
            lottoSize = 6;
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
    public CmyException1(String msg)   //�غc�l
    {
        super();
        System.out.println(msg);
    }        
}

class CmyException2 extends Exception
{
    public CmyException2()   //�غc�l
    {
         super();
    }
    public CmyException2(String msg)   //�غc�l
    {
        super();
        System.out.println(msg);
    }     
}