/*  �ɦW:app_01.java        �\��:Applet�U�۰ʰ����k������ɾ�  */

import java.lang.*;
import java.awt.*;           //���JAWT���O�w
import java.applet.Applet;   //���JApplet���O

public class app_01  extends Applet  //�N��applet���D���O
{      
    Label lab;
    public void init()
    {    	
    	lab = new Label("��X��Java�D���x");
    	this.add(lab);
    	this.setBackground(Color.PINK);
    	this.setSize(400,300);         //���s�����L�@��
    	this.setVisible(false);        //����L��
    	System.out.println("����init()...");   	
    }    
    public void start()
    {
    	System.out.println("����start()...");
    }    
    public void stop()
    {
    	System.out.println("����stop()...");
    }	    
    public void destroy()
    {
    	System.out.println("����destroy()...");
    }
}