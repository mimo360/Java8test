/*  �ɦW:ch16_10_1.java          
    �\��:��������@ActionListener ���� */

package myJava.ch16;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;      //���JAWT�ƥ����O�w

public class ch16_10_1  extends Frame  implements ActionListener
{                                       //��@ActionListener����
    
    Button btn;
    
    public ch16_10_1()
    {    	
        this.setTitle("������@ActionListener����"); 
        this.setLayout(new FlowLayout());
        btn = new Button("���s1");
        this.add(btn);               

        this.setSize(200,100);      
        this.setVisible(true);     
    }

    public void actionPerformed(ActionEvent e)   //�N�Ҧ�������@����k��W�A���e�Ȯɬ���
    { 
    } 


    public static void main(String args[])
    {    	
        new ch16_10_1();    	
    }
}