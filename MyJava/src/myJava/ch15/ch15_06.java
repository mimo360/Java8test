/*  �ɦW:ch15_06.java          �\��:�ΦW���O  */

package myJava.ch15;
import java.lang.*;

public class ch15_06        //�D���O
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
    public void show1()
    {
        System.out.println("���OCA��show1���椤,Var=" + Var); 
    }
    public void show2()
    {
        System.out.println("���OCA��show2���椤,Var=" + Var);
    }
}

class CB
{ 
    public void runMehtod1()
    {     
        //�ΦW���O�}�l
        CA obj1 = new CA() 
        {
            public void show1()
            {
                System.out.print("�o�O�ѰΦW���O��g��show1�禡");
                System.out.println(",Var=" + Var);
            }
            public void show3()
            {
                System.out.print("�o�O�ѰΦW���O�s�W��show3�禡");
                System.out.println(",Var=" + Var);
            }
        };  //�ΦW���O����
     
        obj1.Var=50;
        obj1.show1();     
        obj1.show2();
        //obj1.show3();  //�L�k����s�W��show3�禡
        
        CA obj2 = new CA();
        System.out.println("---------------------------------");
        obj2.Var=30;
        obj2.show1();     
        obj2.show2();
        //obj2.show3(); //�L�k����s�W��show3�禡   
    }  
}