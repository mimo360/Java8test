/*  �ɦW:ch4_04.java      �\��:if-else��ܩʱԭz�d��   */

package myJava.ch04;
import java.lang.*;
import java.util.Scanner;

public class ch4_04         //�D���O
{
    public static void main(String args[])
    {
        Scanner keyboardInput = new Scanner(System.in);
        int OnePrice = 200,Qty;
        double TotalPrice;
        
        System.out.println("�C�i�J�������欰" + OnePrice + "��");
        System.out.print("�п�J�z�n�ʶR���i��:");        
        Qty = Integer.parseInt(keyboardInput.nextLine());
        System.out.println("==========================");
        TotalPrice = OnePrice * Qty;
        if(Qty>=10)
        {
           TotalPrice = OnePrice * Qty * 0.9;
           System.out.println("�ʶR10�i�H�W���E��");
        }
        else
        {
           TotalPrice = OnePrice * Qty;
           System.out.println("�z���ʶR10�i�H�W���J����,��������");
        }
        System.out.println("�`����" + TotalPrice + "��");
    }
}