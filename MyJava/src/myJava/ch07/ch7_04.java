/*   �ɦW:ch7_04.java        �\��:�غc�禡   */

package myJava.ch07;
import java.lang.*;

public class ch7_04         //�D���O
{
    public static void main(String args[])
    {
        CMyClass X = new CMyClass(1);    //�۰ʩI�s�غc�禡
        CMyClass Y = new CMyClass(2);     //�۰ʩI�s�غc�禡
        
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
    public CMyClass(int i)
    {
        Var = i;
    }
    public void addVar(int b)
    {
        Var = Var + b;
    }
    public void showVar()
    {
    	realShow();  //����private���Ū��禡
    }
    private int Var;
    private void realShow()
    {
    	System.out.println("Var=" + Var);
    }
}
