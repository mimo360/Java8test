package myJava.exercise.ch07;
import java.lang.*;
import java.util.Scanner;

public class ex7_03         //�D���O
{
    public static void main(String args[])            //3-g  �w����
    {
    	CPersonAccount obj = new CPersonAccount();
    	char runFunc='d';
        Scanner keyboardInput = new Scanner(System.in);
        
        while(runFunc!='q')
        {
          System.out.print("�п�ܧ@�~");
          System.out.print("(i=��J��� s=�̤��~��Ƨ� d=��ܸ�� q=���}):");
          runFunc = keyboardInput.nextLine().charAt(0);
          switch (runFunc)
          {
            case 'i':
               obj.inputData();
               break;            
            case 's':
               obj.sortBySalary();
               break;
            case 'd':
               obj.displayData();
               break;
           default:
               break;
          }
        }
   }  
}    

class CPersonData              
{

}

class CPersonAccount
{

}