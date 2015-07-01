/*  �ɦW:ch16_18.java          �\��:MouseEvent�ƥ�(�ƹ��e���u)  */

package myJava.ch16;
import java.lang.*;
import java.awt.*;           //���JAWT���O�w
import java.awt.event.*;     //���JAWT�ƥ����O�w

public class ch16_18  extends Frame
{      
    int startX,startY;  //�s��ø�ϰ_�l�I
    public ch16_18()
    {    	
        this.setTitle("MouseEvent�ƥ�");    	   	
    	    	 
        //���U��ť��
        this.addWindowListener(new WindowAdapter()  //�ΦW���O:��������
        {
            public void windowClosing(WindowEvent e)  
            {
                System.exit(0);  //��������
            }  	
        });
        this.addMouseListener(new CMyListener1());     //���U�ƥ��ť��
        //���U��ť�̵���     	
    	
        this.setSize(250,150);      
        this.setVisible(true);     
    }  

    public static void main(String args[])
    {    	
        new ch16_18();    	
    }

    class CMyListener1 extends MouseAdapter //�H�۩w�ƥ��ť��1
    {    	   	
        public void mousePressed(MouseEvent e) //�ƥ�B�z���g�B
        {
            Graphics g = getGraphics();      //���o�@��ø�Ϫ���g
            if(e.getButton() == e.BUTTON3)   //���U�ƹ��k��|�O���s���_�l�I
            {
                startX = e.getX();
                startY = e.getY();
            }
            if(e.getButton() == e.BUTTON1)   //���U�ƹ�����
                g.drawLine(startX,startY,e.getX(),e.getY()); //�e�u
        }      	    
    }    
}