/*  �ɦW:ch7_03.java        �\��:�����ܼƳ]�w��l��  */

package myJava.ch07;
import java.lang.*;

public class ch7_03         //�D���O
{
    public static void main(String args[])
    {
        CMyClass X = new CMyClass();
        CMyClass Y = new CMyClass();
        
        X.addVar(10);     //�bX����W,����addVar�����禡
        System.out.print("����X\t");
        X.showVar();
        
        System.out.print("����Y\t");
        Y.addVar(5);      //�bY����W,����addVar�����禡
        Y.showVar();

        System.out.print("����Y\t");
        Y.addVar(3);      //�bY����W,����addVar�����禡
        Y.showVar();  
    } 
}    

class CMyClass
{
    public void addVar(int b)
    {
        Var = Var + b;
    }
    public void showVar()
    {
    	realShow();  //����private���Ū��禡
    }
    private int Var=1;        //�]�w��l��
    private void realShow()
    {
    	System.out.println("Var=" + Var);
    }
}
