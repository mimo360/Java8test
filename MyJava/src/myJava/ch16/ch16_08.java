/*  �ɦW:ch16_08.java          �\��:GridLayoout�����޲z��  */

package myJava.ch16;
import java.lang.*;
import java.awt.*;     //���JAWT���O�w

public class ch16_08 
{       
    public static void main(String args[])
    {
        Frame frm1 = new Frame();     //��������    	
        frm1.setLayout(new GridLayout(0,3));  //��Ƭ�3�A�����w�C��
    	
        frm1.setTitle("�ϥ�GridLayout�����޲z��");
        frm1.add(new Button("���s1"));
        frm1.add(new Button("���s2"));
        frm1.add(new Button("���s3"));
        frm1.add(new Button("���s4"));
        frm1.add(new Button("���s5"));
          
        frm1.setSize(300,300);  
        frm1.setVisible(true);         	
    } 
}