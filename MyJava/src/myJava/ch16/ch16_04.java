/*  �ɦW:ch16_04.java          �\��:JFrame�������[�J����  */

package myJava.ch16;
import java.lang.*;
import javax.swing.*;     //���JSwing���O�w
import java.awt.*;        //���JAWT���O�w,�ҦpColor���O��AWT���O�w

public class ch16_04 
{       
    public static void main(String args[])
    {
        CMyJWindow jfrm1 = new CMyJWindow();     //��������
    	
        jfrm1.addNewLabel("�s�W����");       	
    } 
}

class CMyJWindow  extends JFrame       //���O�~��JFrame���O
{
    //�ϥ����O�����覡�ŧi������������
    JButton btn1;  //���O����
    JButton btn2;  //���O���� 
    public CMyJWindow()     //�غc�l
    {
        Container cp = this.getContentPane(); //���o������ContentPane
        cp.setLayout(null);          //�]�w�����s��,��ʫ��w�U�����m
    	
        btn1 = new JButton("���s1");   //�غc�U���󪺹���    	
        btn2 = new JButton();
    	
        //�]�w�U�����ݩʡA�Ҧp�~�[�A�j�p����
    	   
        btn1.setBounds(75,100,100,75);   //�]�w���s��m�P�j�p����
        btn2.setBounds(25,50,50,25);     //�]�w���s��m�P�j�p����
        btn1.setFont(new Font("Serif",Font.BOLD,12)); //�]�w�r��
    	
        //�]�w�U����������ƥ��ť����A�Ȯɬٲ�
    	
        //�z�LFrame��add()��k�A�N�U����[�J��������
        cp.add(btn1);      //ContentPane�[�J���s1
        cp.add(btn2);      //ContentPane�[�J���s2
    	
        cp.setBackground(Color.yellow);  //�]�wContentPane���I���C��
    	
        this.setTitle("�[�J����JFrame����");  //�]�w�������ݩ�
        this.setSize(300,300);                  //�]�w�������ݩ�
    	
        //�]�w�����������ƥ��ť����A�Ȯɬٲ�        

        this.setVisible(true);   //��ܵ���    	
    }
    public void addNewLabel(String str1)
    {    
        JLabel lab = new JLabel(str1);       //���ͼ��ҹ���   	
        lab.setBounds(170,150,60,60);        //�]�w���Ҧ�m�P�j�p
        lab.setFont(new Font("Serif",Font.BOLD,12)); //�]�w�r��
        Container cp1 = this.getContentPane();    	
        cp1.add(lab);                     //ContentPane�[�J����
    	
        cp1.setBackground(Color.green);
        btn1.setBackground(Color.red);    
    } 
    
    // �ƥ��ť����A�Ȯɬٲ�    
}