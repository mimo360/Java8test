/*  �ɦW:ch15_09.java          �\��:�ΦW���O������  */

package myJava.ch15;
import java.lang.*;

public class ch15_09       //�D���O
{
   public static void main(String args[])
   {
      CB objX = new CB(); 
      objX.runMehtod1();
   } 
}       

class CB
{ 
   public int Var1=5;

   public void runMehtod1()
   { 
      int localVar1=100;           //�Dfinal�ܼ�
      final int localVar2=100;     //final�ܼ�
       
      ( new Object()  //�ΦW���O�}�l
        {            
            public void show()
            {
                  System.out.println("�o�O�ѰΦW���O�s�W��show�禡"); 
                  System.out.println("localVar2=" + localVar2);                
     	    }
        } ).show();     //����s�W��show�禡       
   }  
}