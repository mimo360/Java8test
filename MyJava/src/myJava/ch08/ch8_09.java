/*   �ɦW:ch8_09.java        �\��:final�b���P��m���׹��γ~   */

package myJava.ch08;
import java.lang.*;

public class ch8_09         //�D���O
{
    public static void main(String args[])
    {
        final String str = new String ("final�׹��r���ܽd");
        //str = new String(".....");
        System.out.println(str);
        CB obj = new CB();    	
        obj.add();
        obj.show();    //�����~�Ӧۤ����O��show()
    } 
}    

class CA
{
    public final int var1;
    public int var2;
    public CA()
    {
        var1 = 10;
        var2 = 10;
    }
    public void add()
    {
        //var1++; 
        var2++;
    }
    public final void show()   //���i�Q��g���禡
    {
      	System.out.println("var1=" + var1 + "\tvar2=" + var2);
    }    
}

class CB extends CA   // �l���OCB�~�Ӧ����OCA
{
    public void add()
    {
        //var1 = var1 + 10;
        var2 = var1 + var2;
    }
    //public void show(){}    
}

final class CC  //���O���i�Q�~��
{
    public int var3;
}

//class CD extends CC{}  
