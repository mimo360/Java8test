/*  �ɦW:ch15_07.java          �\��:����ΦW���O�s�W���禡  */

package myJava.ch15;
import java.lang.*;

public class ch15_07        //�D���O
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
    public void runMehtod1()
    {            
        (new CA()  //�ΦW���O�}�l
         {
            public void show()
            {
                System.out.print("�o�O�ѰΦW���O�s�W��show�禡");
                System.out.println(",Var=" + Var);
            }
         }).show();     //����s�W��show�禡       
    }  
}