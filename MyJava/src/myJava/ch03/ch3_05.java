/*   �ɦW:ch3_05.java    �\��:�줸�޿�β���B��l�d��    */

package myJava.ch03;
import java.lang.*;

public class ch3_05         //�D���O
{
  public static void main(String args[])
  {
      short x=100,y=50,p=3;
      int xx=0;
     
      System.out.println("p=3");
      System.out.println("x=01100100");
      System.out.println("y=00110010");
      System.out.println("--------------------");
      System.out.println("not xx   ==> " + ~xx);
      System.out.println("x and y  ==> " + (x & y));
      System.out.println("x or y   ==> " + (x | y));
      System.out.println("x xor y  ==> " + (x ^ y));       
      System.out.println("x >>> p  ==> " + (x >>> p));
      System.out.println("x << p   ==> " + (x << p));
  }
}