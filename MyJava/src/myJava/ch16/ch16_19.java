/*  �ɦW:ch16_19.java            
    �\��:MouseEvent�PInputEvent�ƥ�(�ƹ�+�S����L��)  */

package myJava.ch16;
import java.lang.*;
import java.awt.*;           //���JAWT���O�w
import java.awt.event.*;     //���JAWT�ƥ����O�w

public class ch16_19  extends Frame
{      
    int startX,startY,endX,endY;  //�s��ø���I
    public ch16_19()
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
        this.addMouseListener(new CMyListener1());        //���U�ƥ��ť��
        this.addMouseMotionListener(new CMyListener1());  //���U�ƥ��ť��
        //���U��ť�̵���     	
    	
        this.setSize(250,150);      
        this.setVisible(true);     
    }  

    public static void main(String args[])
    {    	
        new ch16_19();    	
    }

    class CMyListener1 extends MouseAdapter //�H�۩w�ƥ��ť��1
    {    	   	
        public void mousePressed(MouseEvent e)  //�ƥ�B�z���g�B
        {
            startX = e.getX();
            startY = e.getY();    	     
        }
    	
        public void mouseDragged(MouseEvent e) //�ƥ�B�z���g�B
        {           
            Graphics g = getGraphics();      //���o�@��ø�Ϫ���g
           
            if(e.isControlDown() == true)   //�P�_Ctrl�O�_�Q���U
                g.setColor(Color.RED);
            else
                g.setColor(Color.BLACK);
    	   
            endX = e.getX();
            endY = e.getY();
            g.drawLine(startX,startY,endX,endY); //�e�u
            startX = endX;    //�ª������I�@���s���_�l�I
            startY = endY;    //�ª������I�@���s���_�l�I
        }      	    
    }    
}