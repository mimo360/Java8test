/*  �ɦW:ch16_16.java          �\��:ItemEvent�ƥ�(�ʺA�������)  */

package myJava.ch16;
import java.lang.*;
import java.awt.*;           //���JAWT���O�w
import java.awt.event.*;     //���JAWT�ƥ����O�w

public class ch16_16  extends Frame
{         
    //�����
    Button btn,btnClr;
    CheckboxGroup ckbgrp1,ckbgrp2,ckbgrp3;
    Checkbox ckb1,ckb2,ckb3,ckb4,ckb5,ckb6,ckb7,ckb8;
    Panel pnl1,pnl2,pnl3;
    Label lab1,lab2;    
    
    public ch16_16()
    {    	
        this.setTitle("ItemEvent�ƥ�");
    	
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
        ckb1 = new Checkbox("����",ckbgrp1,true);     //�w�]�ﶵ
        ckb2 = new Checkbox("���",ckbgrp1,false);
        ckb3 = new Checkbox("�����W",ckbgrp2,true);   //�w�]�ﶵ
        ckb4 = new Checkbox("�J���s",ckbgrp2,false);
        ckb5 = new Checkbox("�^�F�{",ckbgrp2,false);
        ckb6 = new Checkbox("���إ�",ckbgrp3,true);   //�w�]�ﶵ
        ckb7 = new Checkbox("���l��",ckbgrp3,false);
        ckb8 = new Checkbox("��­�",ckbgrp3,false);
    	
        pnl1.add(ckb1);  pnl1.add(ckb2);                //�[�J���O
        pnl2.add(ckb3);  pnl2.add(ckb4); pnl2.add(ckb5);//�[�J���O
        pnl3.add(ckb6);  pnl3.add(ckb7); pnl3.add(ckb8);//�[�J���O
    	    	
        pnl2.setVisible(true);   //�w�]������
        pnl3.setVisible(false);  //�Ȯɥ�����
    	
        //�]�w�����m
        lab1.setBounds(20,35,250,50);
        pnl1.setBounds(20,90,100,50);
        pnl2.setBounds(150,90,90,100); //pnl2�Ppnl3���|
        pnl3.setBounds(150,90,90,100); //pnl2�Ppnl3���|
        btnClr.setBounds(20,150,40,20);
        btn.setBounds(80,150,40,20);
        lab2.setBounds(20,180,250,50);
   	
        //����[�J����
        this.add(lab1);         this.add(pnl1);
        this.add(pnl2);         this.add(pnl3);
        this.add(btnClr);       this.add(btn);     	
        this.add(lab2);    	
        //  �����t�m����
    	
    	    	 
        //���U��ť��
        this.addWindowListener(new WindowAdapter()  //�ΦW���O:��������
        {
            public void windowClosing(WindowEvent e)  
            {
                System.exit(0);  //��������
            }  	
        });
        ckb1.addItemListener((ItemEvent e) ->
        {   //itemStateChanged(ItemEvent e) �ƥ�B�z�{���϶�
            if(ckb1.getState()==true)
            {
                pnl2.setVisible(true);
                pnl3.setVisible(false);
            }
        });  //���U��ť��
        ckb2.addItemListener((ItemEvent e) ->
        {   //itemStateChanged(ItemEvent e) �ƥ�B�z�{���϶�
            if(ckb2.getState()==true)
            {
                pnl3.setVisible(true);  
                pnl2.setVisible(false); 
            }    	   
        }); //���U��ť��
        btn.addActionListener((ActionEvent e) -> 
        {   // actionPerformed(ActionEvent e)�ƥ�B�z�{���϶�
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
        });     //���U��ť��
        btnClr.addActionListener((ActionEvent e) ->
        {   // actionPerformed(ActionEvent e)�ƥ�B�z�{���϶�	   
            lab2.setText("");
            pnl2.setVisible(true);  
            pnl3.setVisible(false);  
            ckb1.setState(true);
            ckb3.setState(true);
            ckb6.setState(true);
        });  //���U��ť��
        //���U��ť�̵���
    	
        this.setBackground(Color.PINK);
        this.setSize(280,250);      
        this.setVisible(true);     
    }  

    public static void main(String args[])
    {    	
        new ch16_16();    	
    }
}
