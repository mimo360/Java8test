/*  �ɦW:ch16_09.java          �\��:���Ǿ��������Ǿ�  */

package myJava.ch16;
import java.lang.*;
import java.awt.*;     //���JAWT���O�w

public class ch16_09
{       
    public static void main(String args[])
    {
        Frame frm1 = new Frame();     //��������    	
        frm1.setLayout(new GridLayout(0,3));  //��Ƭ�3�A�����w�C��
    	
        Panel pn1 = new Panel();
        pn1.setLayout(new GridLayout(1,2));   //1�C2��       
        pn1.add(new Button("���sa"));
        pn1.add(new Button("���sb"));
        
        frm1.setTitle("���Ǿ��������Ǿ�");
        frm1.add(new Button("���s1"));
        frm1.add(pn1);
        frm1.add(new Button("���s2"));
        frm1.add(new Button("���s3"));
        frm1.add(new Button("���s4"));
        frm1.add(new Button("���s5"));
          
        frm1.setSize(300,300);  
        frm1.setVisible(true);         	
    } 
}