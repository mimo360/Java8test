/*  �ɦW:ch3_03.java    �\��:��N�B��l�d��   */

package myJava.ch03;
import java.lang.*;

public class ch3_03         //�D���O
{
  public static void main(String args[])
  {
    float answer;
    float a=2.1f,b=3.5f,c=4.0f;
    int x,y;
    x = 20;
    y = 7;
    System.out.print("��x=" + x + "    ");
    System.out.println("y=" + y + "��");
    System.out.println("x + y = " + (x+y));
    System.out.println("x - y = " + (x-y));
    System.out.println("x * y = " + (x*y));
    System.out.println("x / y = " + (x/y));  // y���i��0
    System.out.println("x % y = " + (x%y));  // y���i��0
    System.out.println("----------------------");
    System.out.print("��a=" + a + "   ");
    System.out.print("b=" + b + "   ");
    System.out.println("c" + c + "��");
    answer = b*b-4*a*c;
    System.out.println("b^2-4ac=" + answer);
  }
}