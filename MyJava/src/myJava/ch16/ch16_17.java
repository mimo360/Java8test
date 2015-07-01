/*  �ɦW:ch16_17.java          �\��:WindowEvent�ƥ�  */

package myJava.ch16;
import java.lang.*;
import java.awt.*;           //���JAWT���O�w
import java.awt.event.*;     //���JAWT�ƥ����O�w

public class ch16_17  extends Frame
{         
    public static void main(String args[])
    {    	
        CMyWindow frm = new CMyWindow();
        frm.dispose();    //����frm�귽,�|��������(�бN����]�����ѭ��s����@��)
    }
}

class CMyWindow  extends Frame       //���O�~��Frame���O
{
    //�ϥ����O�����覡�ŧi������������
    
    public CMyWindow()     //�غc�l
    {
        this.addWindowListener(new CMyListener());    	
        this.setBackground(Color.PINK);
        this.setSize(280,250);
        this.setVisible(true);    	   //��ܵ���
        System.out.println("�����w�Q�ݨ�");
    }
    
    class CMyListener implements WindowListener
    {
        public void windowActivated(WindowEvent e) 
        {
            System.out.println("�����ܬ��@�ε���windowActived running..");
        }
        public void windowClosed(WindowEvent e) 
        {
            System.out.println("�����w�g�Q����windowClosed running..");
        }
        public void windowClosing(WindowEvent e) 
        {
            System.out.println("���������s�Q���UwindowClosing running..");
            System.exit(0);
            System.out.println("����Q����..");           
        }
        public void windowDeactivated(WindowEvent e) 
        {
            System.out.println("�����ܬ��D�@�ε���windowDeactivated running..");
        }
        public void windowDeiconified(WindowEvent e) 
        {
            System.out.println("�����ܬ��@�몬�AwindowDeiconified running..");
        }
        public void windowIconified(WindowEvent e) 
        {
            System.out.println("�����ܬ��̤p��windowIconified running..");
        }
        public void windowOpened(WindowEvent e)
        {
            System.out.println("�����ܤw�}��windowOpened running..");
        }
    }
}