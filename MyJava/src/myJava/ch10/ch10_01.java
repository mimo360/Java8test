/*   �ɦW:ch10_01.java          �\��:�o�ͨҥ~���p���d��  */

package myJava.ch10;
import java.lang.*;
import java.util.Scanner;

public class ch10_01         //�D���O
{
    public static void main(String args[])
    {
     	fraction obj = new fraction();
     	obj.set_value();
     	obj.print_value();        
    } 
}    

class fraction
{
    private Scanner keyboardInput;
    private int numerator;        //���l
    private int denominator;      //����
    
    public fraction(){ keyboardInput = new Scanner(System.in); }
    
    public void set_value()
    {
     	System.out.print("��J���l:");
     	numerator = Integer.parseInt(keyboardInput.nextLine());   
     	System.out.print("��J����:");
     	denominator = Integer.parseInt(keyboardInput.nextLine());         
    }
    public void print_value()
    {
     	System.out.print(numerator + "/" + denominator + "=");
     	System.out.println(numerator/denominator);
    }
}