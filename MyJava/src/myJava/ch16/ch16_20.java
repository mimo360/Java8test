/*  �ɦW:ch16_20.java          �\��:KeyEvent�ƥ�  */

package myJava.ch16;
import java.lang.*;
import java.awt.*;           //���JAWT���O�w
import java.awt.event.*;     //���JAWT�ƥ����O�w

public class ch16_20  extends Frame
{         
    //�����

    TextField txf;
    TextArea  txa1,txa2;
    
    public ch16_20()
    {    	
        this.setTitle("KeyEvent�ƥ�");
    	
        //  �����t�m�}�l
        this.setLayout(null);        //��ʰt�m����    	
        txf = new TextField(28);     //�]�w���׬�28
        txa1 = new TextArea("",10,30,TextArea.SCROLLBARS_NONE);
        txa1.setEditable(false);     //TextArea���i�s��
        txa2 = new TextArea("",4,9,TextArea.SCROLLBARS_NONE);
        txa2.setEditable(false);     //TextArea���i�s��
    	    	
        txf.setBounds(20,35,340,20);
        txa1.setBounds(20,70,160,100);
        txa2.setBounds(200,70,160,100);
    	
        this.add(txf);    	this.add(txa1);   this.add(txa2);
   	//  �����t�m����
    	    	 
        //���U��ť��
        this.addWindowListener(new WindowAdapter()  //�ΦW���O:��������
        {
            public void windowClosing(WindowEvent e)  
            {
                System.exit(0);  //��������
            }  	
        });
        txf.addKeyListener(new CMyListener1());     //���U�ƥ��ť��
        //���U��ť�̵���    	    	
    	
        this.setBackground(Color.PINK);
        this.setSize(400,220);      
        this.setVisible(true);     
    }  

    public static void main(String args[])
    {    	
        new ch16_20();    	
    }
    
    //�H�U�������O���ƥ��ť��
    class CMyListener1 implements KeyListener //�۩w�ƥ��ť��1
    {
        public void keyPressed(KeyEvent e)  //�ƥ�B�z���g�B
        {
            txa1.setText("");  //�M��
            txa1.append("���U����r����" + e.getKeyChar() +"\n");
            txa1.append("���U����r�X��" + e.getKeyCode() +"\n");
            if(e.isActionKey() == true)   //�P�_������Q���U
            {
                txa1.append("���U���OAction Key\n");
            }
            if(e.isControlDown() == true)
                txa1.append("Ctrl�Q���U\n");
             
            if(e.isShiftDown()==true)
                txa1.append("Shift�Q���U\n");
             
            if(e.isAltDown()==true)
                txa1.append("Alt�Q���U\n");
            
            txa2.setText("");  //�M��
            txa2.append("keyPressed is running\n");
        }
        public void keyTyped(KeyEvent e) 
        {
            txa2.append("keyTyped is running\n");	
        }
        public void keyReleased(KeyEvent e)
        {
            txa2.append("keyReleased is running\n");	
            //txf.setText("");  //�M��,�������ѫ�i�H���ճs������
        }
    }   
}