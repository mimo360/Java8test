/*  �ɦW:app_03.java          �\��:���oHTML�����  */

import java.lang.*;
import java.awt.*;           //���JAWT���O�w
import java.applet.Applet;   //���JApplet���O

public class app_03  extends Applet  //�N��applet���D���O
{      
    Label lab;
    String str;
    public void init()
    {    	
    	lab=new Label("");
    	this.add(lab);
    	str=this.getParameter("backcolor");
    	if(str!=null)  //�Dnull�N��HTML���Ѧ��@�Ѽ�    	
    	{
    	   if(str.equals("Green"))
    	   {
    	     this.setBackground(Color.GREEN); 
    	     lab.setText("HTML�]�wApplet���C�⬰���");  
    	   }
    	   else if(str.equals("Yellow"))
    	   {
    	     this.setBackground(Color.YELLOW);
    	     lab.setText("HTML�]�wApplet���C�⬰����");  
    	   }	
    	   else
    	   {
    	   	this.setBackground(Color.PINK);    //�w�]�C��
    	   	lab.setText("�����\HTML�]�wApplet�C�⬰" + str);
    	   }
       }
       else         //null�N��HTML�å����Ѧ��@�Ѽ�
    	{
    	   this.setBackground(Color.PINK);         //�w�]�C��
    	   lab.setText("HTML���]�wApplet���C��");
    	}     	
    }
}