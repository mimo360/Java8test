/*  �ɦW:ch16_03.java          �\��:Frame�������[�J����  */

package myJava.ch16;
import java.lang.*;
import java.awt.*;     //���JAWT���O�w

public class ch16_03 
{       
    public static void main(String args[])
    {
        CMyWindow frm1 = new CMyWindow();     //��������
    	
        frm1.addNewLabel("�s�W����");       	
    } 
}

class CMyWindow  extends Frame       //���O�~��Frame���O
{
    //�ϥ����O�����覡�ŧi������������
    Button btn1;  //���O����
    Button btn2;  //���O���� 
    public CMyWindow()     //�غc�l
    {
        this.setLayout(null);  //�]�w�����s��,��ʫ��w�U�����m
    	
        btn1 = new Button();   //�غc�U���󪺹���
        btn2 = new Button();   //�غc�U���󪺹���
    	
    	//�]�w�U�����ݩʡA�Ҧp�~�[�A�j�p����
        btn1.setLabel("���s1");        
        btn1.setBounds(75,100,100,75); //�]�w���s��m�P�j�p����    	
        btn2.setBounds(25,50,50,25);   //�]�w���s��m�P�j�p����    	
    	
    	//�]�w�U����������ƥ��ť����A�Ȯɬٲ�
    	
    	//�z�LFrame��add()��k�A�N�U����[�J��������
        this.add(btn1);      //�����[�J���s1
        this.add(btn2);      //�����[�J���s2
    	
        this.setTitle("�[�J����Frame����");  //�]�w�������ݩ�
        this.setSize(300,300);                 //�]�w�������ݩ�
    	
    	//�]�w�����������ƥ��ť����A�Ȯɬٲ�        

        this.setVisible(true);   //��ܵ���    	
    }
    public void addNewLabel(String str1)
    { 
        Label lab = new Label(str1);     //���ͼ��ҹ���   	
        lab.setBounds(170,150,60,60);    //�]�w���Ҧ�m�P�j�p
        this.add(lab);                   //�����[�J����
    	
        this.setBackground(Color.green);
        btn1.setBackground(Color.red);    	
    } 
    
    // �ƥ��ť����A�Ȯɬٲ�    
}