/*  �ɦW:ch15_08.java          �\��:�ΦW���O������  */

package myJava.ch15;
import java.lang.*;

public class ch15_08       //�D���O
{
   public static void main(String args[])
   {
      CB objX = new CB(); 
      objX.runMehtod1();
   } 
}       

class CA  //���O�w�q
{
   public int Var;
   public CA(){Var=20;}     
}

class CB
{ 
   public int Var1=5;

   public void runMehtod1()
   { 
      int localVar1=100;           //�Dfinal�ܼ�
      final int localVar2=100;     //final�ܼ�
       
      ( new CA()  //�ΦW���O�}�l
        {
            public int a=10;
            //public static int b=10;//  ����ŧistatic�ܼ�
            public void show()
            {
                  System.out.println("�o�O�ѰΦW���O�s�W��show�禡");
                  System.out.println("Var1=" + Var1);  //Ū���~�����O����
                  System.out.println("a=" + a);
                  System.out.println(localVar1);    //SE7�L�kŪ���Dfinal�ܼ�
                  localVar1++;
                  System.out.println("localVar2=" + localVar2);
     	   }
        } ).show();     //����s�W��show�禡       
   }  
}