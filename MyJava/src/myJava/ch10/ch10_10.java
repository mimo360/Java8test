/*  �ɦW:ch10_10.java          �\��:�Ѥ�k���ҥ~  */

package myJava.ch10;
import java.lang.*;
import java.util.Scanner;

public class ch10_10         //�D���O
{
    public static void main(String args[])
    {    	  	
        CmyClass2 obj2 =  new CmyClass2();
    	
        try
        {   	   
            obj2.run();           //����k�i�ಣ�ͨҥ~ 	    
        }
        catch(NumberFormatException e)
        {
            System.out.println("�ҥ~����:�п�J�Ʀr");
        }
        catch(ArithmeticException e)
        {
            System.out.println("�ҥ~����:������0");
        }  
        catch(Exception e)
        {
            System.out.println("�����Ҽ{�쪺�ҥ~�o�ͤF");
        }    	
        finally
        {
        }    	    	 	
    } 
}

class CmyClass1
{
    private int numerator,denominator;    
    public Scanner keyboardInput = new Scanner(System.in);
      
    public void setValue() throws NumberFormatException
    {
        System.out.print("��J���l:");
        numerator = Integer.parseInt(keyboardInput.nextLine());              
        System.out.print("��J����:");
        denominator = Integer.parseInt(keyboardInput.nextLine());         
        System.out.println("��ƿ�J����"); 
    }
    
    public void printValue() throws ArithmeticException
    {
        System.out.println("���k���G��" + numerator/denominator);
        System.out.println("���k���槹��");
    }
}

class CmyClass2
{
  public CmyClass1 obj1 = new CmyClass1();
  public void run()  throws NumberFormatException,ArithmeticException
  {
        obj1.setValue();           //����k�i�ಣ�ͨҥ~
        obj1.printValue();         //����k�i�ಣ�ͨҥ~.
  }
}	