/*  �ɦW:ch16_06.java          �\��:BorderLayoout�����޲z��  */

package myJava.ch16;
import java.lang.*;
import java.awt.*;     //���JAWT���O�w

public class ch16_06 
{       
    public static void main(String args[])
    {
        Frame frm1 = new Frame();     //��������    	
        frm1.setLayout(new BorderLayout());    	//�i�ٲ�	
        frm1.setTitle("�ϥ�BorderLayout�����޲z��");
        Button btn1 = new Button("�F���s");
        btn1.setBounds(75,100,100,75);  //����L�@��
        frm1.add(btn1,BorderLayout.EAST);  
        frm1.add(new Button("�n���s"),BorderLayout.SOUTH);
        frm1.add(new Button("�_���s"),BorderLayout.NORTH);
        frm1.add(new Label("��������",Label.CENTER),BorderLayout.CENTER); 
        frm1.setSize(300,300);  
        frm1.setVisible(true);         	
    } 
}
