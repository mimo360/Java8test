/*  �ɦW:ch16_10.java 
    �\��:implements ActionListener����,�H�ӵ������O�@���ƥ��ť��  */

package myJava.ch16;
import java.lang.*;
import java.awt.*;           //���JAWT���O�w
import java.awt.event.*;     //���JAWT�ƥ����O�w

public class ch16_10  extends Frame implements ActionListener  
{                     //�D���O�~��Frame���O,�ù�@ActionListener����
    
    Button btn;
    
    public ch16_10()
    {    	
        this.setTitle("������@ActionListener����"); 
        this.setLayout(new FlowLayout());
        btn = new Button("���s1");
        this.add(btn);                 //�Nbtn�[�J����
        btn.addActionListener(this);   //�����@��btn1��ActionListener 
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
        new ch16_10();    	
    }
}