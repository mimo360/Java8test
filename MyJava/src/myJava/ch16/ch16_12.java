/*  �ɦW:ch16_12.java             
    �\��:extends MouseAdapter���O,�åH�۩w���������O�@���ƥ��ť��  */

package myJava.ch16;
import java.lang.*;
import java.awt.*;           //���JAWT���O�w
import java.awt.event.*;     //���JAWT�ƥ����O�w

public class ch16_12  extends Frame
{     
    Button btn;
    public ch16_12()
    {    	
        this.setTitle("�������Oextends MouseAdapter���O"); 
        this.setLayout(new FlowLayout());
        btn = new Button("���s1");
        this.add(btn);
        btn.addMouseListener(new CMyListener());   //���U�ƥ��ť��
        this.setSize(200,100);      
        this.setVisible(true);     
    }  

    public static void main(String args[])
    {    	
        new ch16_12();    	
    }
    
    class CMyListener extends MouseAdapter //�H�۩w���������O�@���ƥ��ť��
    {
        public void mouseEntered(MouseEvent e)
        {
            btn.setLabel("btn1");
        }
        public void mouseExited(MouseEvent e)
        {
            btn.setLabel("���s1");
        }
    }
}