/*  �ɦW:ch16_13.java          �\��:�ΦW���O���g�����ƥ�  */

package myJava.ch16;
import java.lang.*;
import java.awt.*;           //���JAWT���O�w
import java.awt.event.*;     //���JAWT�ƥ����O�w


public class ch16_13  extends Frame
{         
    public ch16_13()
    {    	
        this.setTitle("�ΦW���O���g�����ƥ�"); 
        //�U���@�ӱԭz�y���\�ର  ���U�ΦW���O���ƥ��ť��
        this.addWindowListener( new WindowAdapter()  
        {
            public void windowClosing(WindowEvent e)  
            {
                System.exit(0);  //��������
            }  	
        } ); 
   	
        this.setSize(200,100);      
        this.setVisible(true);     
    }  

    public static void main(String args[])
    {    	
        new ch16_13();    	
    }
}