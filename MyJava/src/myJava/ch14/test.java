/*
 �ɦW:ch14_01.java          
 �\��:�x����k
 */
package myJava.ch14;
import java.lang.*;
import java.io.*;

public class test         //�D���O
{
    public static void main(String args[])
    {
    	double a1=0.7,b1=9.3,c1;
        int a2=25,b2=56,c2;

    	CMyclass obj1 = new CMyclass();
    	c1 = obj1.max(a1,b1);  
    	c2 = obj1.max(a2,b2); 
    } 
}
class CMyclass
{
  public <N extends Number> N max(N a,N b)
  {   
      if(a>=b) return a;
      else return b;      
  }  
}
