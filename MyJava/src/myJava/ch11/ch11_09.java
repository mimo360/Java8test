/*  �ɦW:ch11_09.java          �\��:�˽c�P��c  */

package myJava.ch11;
import java.lang.*;

public class ch11_09         //�D���O
{
    public static void main(String args[])
    {
        Long myLongInt = new Long("5");         //�˽c
        long L1 = myLongInt.longValue();        //��c
        int I1 = myLongInt.intValue();          //��c
        
        //CRect obj = new CRect(L1,I1);   //�䤣��غc�l
        CRect obj = new CRect(I1,I1);
        obj.showArea(); 
    } 
}    

class CRect
{
   protected int area;
   protected int len,width;
   public CRect(int i,int j){len = i; width = j;}
   
   public void showArea()
   {
        area = len * width;
        System.out.println("Area=" + area);
   }  
}