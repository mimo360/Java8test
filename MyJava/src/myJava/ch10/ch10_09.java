/*  �ɦW:ch10_09.java         �\��:�Ѥ�k��X�ҥ~  */

package myJava.ch10;
import java.lang.*;
import java.util.Scanner;

public class ch10_09         //�D���O
{
    public static void main(String args[])
    {    	  	
        CmyClass obj =  new CmyClass();
    	
        try
        {   	   
            obj.setValue();           //����k�i�ಣ�ͨҥ~
            obj.printValue();         //����k�i�ಣ�ͨҥ~
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

class CmyClass
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