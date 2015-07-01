/*
 �ɦW:ex1_01.java          
 �\��:�sĶ�P��������{��
 */
package myJava.exercise.ch01;
import java.lang.*;
import java.awt.*;           //���JAWT���O�w
import java.awt.event.*;     //���JAWT�ƥ����O�w

public class ex1_01  extends Frame
{         
    Button btn;
    Label lab;
    int x,y;
    
    public ex1_01()
    {    	
    	this.setTitle("KeyEvent�ƥ�");
    	
    	//  �����t�m�}�l
    	this.setLayout(null);        //��ʰt�m����    	
    	btn = new Button("���s");
    	lab = new Label("�iShift�j�P�iCtrl�j��P�ɫ��U�ɥi�Q�Τ�V�䲾�ʫ��s");
    	lab.setFont(new Font("�s�ө���",Font.BOLD,18));
    	lab.setBounds(20,30,480,40);
    	x=280; y=180;  //�_�l��m
    	btn.setBounds(x,y,40,40);
    	this.add(lab);   	
    	this.add(btn);  
   	//  �����t�m����
    	    	 
    	//���U��ť��
    	this.addWindowListener(new WindowAdapter()  //�ΦW���O:��������
    	{
    	   public void windowClosing(WindowEvent e)  
    	   {
    	   	System.exit(0);  //��������
    	   }  	
    	});
    	btn.addKeyListener(new CMyListener1());     //���U�ƥ��ť��
    	//���U��ť�̵���    	    	
    	
    	this.setBackground(Color.PINK);
    	this.setSize(600,400);      
    	this.setVisible(true);     
    }  

    public static void main(String args[])
    {    	
    	new ex1_01();    	
    }
    
    //�H�U�������O���ƥ��ť��
    class CMyListener1 implements KeyListener //�H�۩w�ƥ��ť��1
    {
    	public void keyPressed(KeyEvent e)  //�ƥ�B�z���g�B
    	{
    	    if((e.isControlDown()==true) && (e.isShiftDown()==true))
            {
            	switch(e.getKeyCode())
                {
                  case 37: //�V������
                    x = x - 20;
                    if(x<10) x=10;   //����ɱ���
                    break;
                  case 38: //�V�W����
                    y = y - 20 ;
                    if(y<80) y=80;   //�W��ɱ���
                    break;
                  case 39: //�V�k����                    
                    x = x + 20 ;
                    if(x>550) x=550; //�k��ɱ���
                    break;
                  case 40: //�V�U����
                    y = y + 20;
                    if(y>350) y=350; //�U��ɱ���
                    break;
                  default:
                      break;
               }
               btn.setBounds(x,y,40,40);  //�]�w����s����m
            }
        }
        public void keyTyped(KeyEvent e) 
        {            
        }
        public void keyReleased(KeyEvent e)
        {
            if((e.isControlDown()==false) && (e.isShiftDown()==false))
            {
            	 x=280; y=180;  //�^�_�_�l��m
                 btn.setBounds(x,y,40,40);  //�]�w����_�l��m
            }
        }
   }   
}