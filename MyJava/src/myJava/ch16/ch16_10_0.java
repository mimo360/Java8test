/* �ɦW:ch16_10_0.java          
   �\��:���[�J�ƥ�B�z���� */

package myJava.ch16;
import java.lang.*;
import java.awt.*;


public class ch16_10_0  extends Frame
{                     
    
    Button btn;
    
    public ch16_10_0()
    {    	
        this.setTitle("������@ActionListener����"); 
        this.setLayout(new FlowLayout());
        btn = new Button("���s1");
        this.add(btn);                

        this.setSize(200,100);      
        this.setVisible(true);  
    }


    public static void main(String args[])
    {    	
        new ch16_10_0();    	
    }
}