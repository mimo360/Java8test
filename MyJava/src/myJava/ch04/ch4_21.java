/*  �ɦW:ch4_21.java        �\��:do-while�j�骺�ܽd  */

package myJava.ch04;
import java.lang.*;
import java.util.Scanner;

public class ch4_21         //�D���O
{
    public static void main(String args[])
    {
      Scanner keyboardInput = new Scanner(System.in);
      char inputChar;
      String inputStr=new String();      
     
      System.out.println("Game Over...");
      do
      {
         System.out.print("Play Again?(y/n)");
         inputStr=keyboardInput.nextLine();         //Ū����L��J���@��r��
         inputChar=inputStr.charAt(0);              //������
      }while((inputChar!='y') && (inputChar!='n'));
    }
}