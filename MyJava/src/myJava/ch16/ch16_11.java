/*  �ɦW:ch16_11.java          �\��:��ӫ��s�@�Ψƥ�(���U�P�@�Ӷ�ť��)  */

package myJava.ch16;
import java.lang.*;
import java.awt.*;           
import java.awt.event.*;     

public class ch16_11  extends Frame implements ActionListener  
{                    
    
    Button btn1,btn2;
    
    public ch16_11()
    {    	
        this.setTitle("��ӫ��s�@�Ψƥ�(���U�P�@�Ӷ�ť��)"); 
        this.setLayout(new FlowLayout());
        btn1 = new Button("���s1");
        btn2 = new Button("���s2");
        this.add(btn1);         
        this.add(btn2);         
        btn1.addActionListener(this);   //�����@��btn1��ActionListener 
        btn2.addActionListener(this);   //�����@��btn2��ActionListener
     	
        this.setSize(200,100);      
        this.setVisible(true);     
    }

    public void actionPerformed(ActionEvent e) //�@�Ψƥ�
    {
        if(e.getSource()==btn1)         //�P�_�ƥ�ӷ�
        {
            if(btn1.getLabel()=="���s1")   btn1.setLabel("btn1");
            else                           btn1.setLabel("���s1");
        }
        else if(e.getSource()==btn2)
        {
            if(btn2.getLabel()=="���s2")   btn2.setLabel("btn2");
            else                           btn2.setLabel("���s2");
        }
    }

    public static void main(String args[])
    {    	
        new ch16_11();    	
    }
}