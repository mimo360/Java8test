/*  �ɦW:ch16_07.java          �\��:FlowLayoout�����޲z��  */

package myJava.ch16;
import java.lang.*;
import java.awt.*;     //���JAWT���O�w

public class ch16_07 
{       
    public static void main(String args[])
    {
        Frame frm1 = new Frame();     //��������    	
        frm1.setLayout(new FlowLayout(FlowLayout.CENTER,50,50));
    	
        frm1.setTitle("�ϥ�FlowLayout�����޲z��");
        frm1.add(new Button("���s1"));
        frm1.add(new Button("���s2"));
        frm1.add(new Button("���s3"));
        frm1.add(new Button("���s4"));
        frm1.add(new Button("���s5"));
         
        frm1.setSize(360,240);  
        frm1.setVisible(true);         	
    } 
}
