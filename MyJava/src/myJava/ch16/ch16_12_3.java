/*  �ɦW:ch16_12_3.java          
    �\��:���g�ƥ�B�z�{���X  */

package myJava.ch16;
import java.lang.*;
import java.awt.*;         
import java.awt.event.*;  

public class ch16_12_3  extends Frame
{     
    Button btn;
    public ch16_12_3()
    {    	
        this.setTitle("�������Oextends MouseAdapter���O"); 
        this.setLayout(new FlowLayout());
        btn = new Button("���s1");
        this.add(btn);                           
        btn.addMouseListener(new CMyListener());
        this.setSize(200,100);      
        this.setVisible(true);     
    }  

    public static void main(String args[])
    {    	
        new ch16_12_3();    	
    }
    
    class CMyListener extends MouseAdapter 
    {
        public void mouseEntered(MouseEvent e) //���g�ƥ�B�z�{���X
        {
            btn.setLabel("btn1");
        }
        public void mouseExited(MouseEvent e)   //���g�ƥ�B�z�{���X
        {
            btn.setLabel("���s1");
        }   	   
    } 
}