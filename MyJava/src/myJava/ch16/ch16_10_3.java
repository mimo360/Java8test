/*  �ɦW:ch16_10_3.java          
    �\��:���g�ƥ�B�z�{���X  */

package myJava.ch16;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;    

public class ch16_10_3  extends Frame  implements ActionListener
{                                   
    
    Button btn;
    
    public ch16_10_3()
    {    	
        this.setTitle("������@ActionListener����"); 
        this.setLayout(new FlowLayout());
        btn = new Button("���s1");
        this.add(btn);               
        btn.addActionListener(this);  
        this.setSize(200,100);      
        this.setVisible(true);     
    }

    public void actionPerformed(ActionEvent e) //�ƥ�B�z���g�B 
    { 
        if(btn.getLabel()=="���s1")
            btn.setLabel("btn1");
        else
            btn.setLabel("���s1");
    } 

    public static void main(String args[])
    {    	
        new ch16_10_3();    	
    }
}