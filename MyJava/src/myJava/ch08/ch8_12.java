/*  �ɦW:ch8_12.java          �\��:toString()����g  */

package myJava.ch08;
import java.lang.*;

public class ch8_12         //�D���O
{
    public static void main(String args[])
    {
        CRect X = new CRect();
        CCircle Y = new CCircle();
        String str = new String();
        str = X.toString();
        System.out.println("CRect���O�������toString():\t" + str);
        str = Y.toString();
        System.out.println("CCircle���O�������toString():\t" + str);        
    } 
}    

class CRect
{
    private int length,width;    
}

class CCircle
{
    private int radius;
    @Override public String toString()
    {
        return "CCircle���O�O�ΨӦs����";
    }    
}