/*  �ɦW:app_02.java          �\��:Frame��g��Applet  */

//��g�B0,���ŧi�������O�w(�]���ɮ��H�ɥi�ಾ��)
import java.lang.*;
import java.awt.*;           //���JAWT���O�w
import java.awt.event.*;     //���JAWT�ƥ����O�w
import java.applet.Applet;   //���JApplet���O,��g�B1

public class app_02  extends Applet   //��g�B2
{         
    //�����
    Button btn,btnClr;
    CheckboxGroup ckbgrp1,ckbgrp2,ckbgrp3;
    Checkbox ckb1,ckb2,ckb3,ckb4,ckb5,ckb6,ckb7,ckb8;
    Panel pnl1,pnl2,pnl3;
    Label lab1,lab2;    
    
    public void init()   //��g�B3,�Hinit()���N�غc�l
    {    	   	
    	//this.setTitle("ItemEvent�ƥ�");   //��g�B4
    	
    	//  �����t�m�}�l
    	this.setLayout(null);     //��ʰt�m����
    	pnl1 = new Panel(new GridLayout(0,1));    	
    	pnl1.setBackground(Color.YELLOW);   
    	pnl2 = new Panel(new GridLayout(0,1));    	
    	pnl2.setBackground(Color.CYAN);      
    	pnl3 = new Panel(new GridLayout(0,1));    	
    	pnl3.setBackground(Color.GREEN);    
    	    	    	
    	btn = new Button("�벼");
    	btnClr = new Button("�M��");
    	lab1 = new Label("�~�׳̨δβy��Ⲽ��");
    	lab1.setFont(new Font("�s�ө���",Font.BOLD,20));   	
    	lab2 = new Label();    
    	ckbgrp1 = new CheckboxGroup();
    	ckbgrp2 = new CheckboxGroup();
    	ckbgrp3 = new CheckboxGroup();	    	
    	ckb1 = new Checkbox("����",ckbgrp1,true);    
    	ckb2 = new Checkbox("���",ckbgrp1,false);
    	ckb3 = new Checkbox("�����W",ckbgrp2,true);   
    	ckb4 = new Checkbox("�J���s",ckbgrp2,false);
    	ckb5 = new Checkbox("�^�F�{",ckbgrp2,false);
    	ckb6 = new Checkbox("���إ�",ckbgrp3,true);   
    	ckb7 = new Checkbox("���l��",ckbgrp3,false);
    	ckb8 = new Checkbox("��­�",ckbgrp3,false);
    	
    	pnl1.add(ckb1);  pnl1.add(ckb2);                
    	pnl2.add(ckb3);  pnl2.add(ckb4); pnl2.add(ckb5);
    	pnl3.add(ckb6);  pnl3.add(ckb7); pnl3.add(ckb8);
    	    	
    	pnl2.setVisible(true);  
    	pnl3.setVisible(false);  
    	
    	//�]�w�����m
    	lab1.setBounds(20,35,250,50);
    	pnl1.setBounds(20,90,100,50);
    	pnl2.setBounds(150,90,90,100); 
    	pnl3.setBounds(150,90,90,100); 
    	btnClr.setBounds(20,150,40,20);
    	btn.setBounds(80,150,40,20);
    	lab2.setBounds(20,180,250,50);
   	
   	//����[�J
    	this.add(lab1);    	this.add(pnl1);
    	this.add(pnl2);    	this.add(pnl3);
    	this.add(btnClr);    	this.add(btn);     	
    	this.add(lab2);    	
    	//  �����t�m����
    	
    	    	 
    	//���U��ť��
    	
    	//��g�B5�A�����]�p������������ť��
    	    
    	ckb1.addItemListener(new CMyItemListener());         
    	ckb2.addItemListener(new CMyItemListener());        
    	btn.addActionListener(new CMyActionListener1());     
    	btnClr.addActionListener(new CMyActionListener2());  
        //���U��ť�̵���
    	
    	this.setBackground(Color.PINK); 
    	lab1.setBackground(Color.PINK); //��L��g
    	lab2.setBackground(Color.PINK); //��L��g
    	//this.setSize(280,250);       //��g�B6,�j�p����HTML���M�w
    	//this.setVisible(true);       //��g�B7
    }  
    

     //��g�B8�A�R��main()
    
    
    
    
    //�H�U�������O���ƥ��ť��
    class CMyItemListener implements ItemListener 
    {
    	public void itemStateChanged(ItemEvent e)  
        {
    	   if(ckb1.getState()==true)
    	   {
    	      pnl2.setVisible(true);  
    	      pnl3.setVisible(false);  
    	   }
    	   else
    	   {
    	      pnl3.setVisible(true);  
    	      pnl2.setVisible(false); 
    	   }    	   
        }    
    }
    
    class CMyActionListener1 implements ActionListener
    {
    	public void actionPerformed(ActionEvent e) 
        {
    	   Checkbox ckb;
    	   if(ckb1.getState()==true)
    	   {
    	      ckb=ckbgrp2.getSelectedCheckbox();    	      
    	   }
    	   else
    	   {
    	      ckb=ckbgrp3.getSelectedCheckbox();  
    	   }
    	   if(ckb==null)
    	     lab2.setText("�п�ܤ@�H");            	    
    	   else
    	     lab2.setText(ckb.getLabel() + "�o�@��");            	    
        }    
    }
    
    class CMyActionListener2 implements ActionListener 
    {
    	public void actionPerformed(ActionEvent e)
        {   	   
    	   lab2.setText("");
    	   pnl2.setVisible(true);  
    	   pnl3.setVisible(false);  
    	   ckb1.setState(true);
    	   ckb3.setState(true);
    	   ckb6.setState(true);    	   
        }    
    }
}