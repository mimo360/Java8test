/*  �ɦW:ch16_10_2.java          
    �\��:�����s���UActionListener��ť��  */

package myJava.ch16;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;    

public class ch16_10_2  extends Frame  implements ActionListener
{                                   
    
    Button btn;
    
    public ch16_10_2()
    {    	
        this.setTitle("������@ActionListener����"); 
        this.setLayout(new FlowLayout());
        btn = new Button("���s1");
        this.add(btn);               
        btn.addActionListener(this);   //�����@��btn1��ActionListener
        this.setSize(200,100);      
        this.setVisible(true);     
    }

    public void actionPerformed(ActionEvent e)  
    { 
    } 


    public static void main(String args[])
    {    	
        new ch16_10_2();    	
    }
}