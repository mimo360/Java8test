/*  �ɦW:ch16_12_1.java          
    �\��:�s�@�@�Ӥ������O�~��xxxAdapter  */

package myJava.ch16;
import java.lang.*;
import java.awt.*;           
import java.awt.event.*;     //���JAWT�ƥ����O�w

public class ch16_12_1  extends Frame
{     
    Button btn;
    public ch16_12_1()
    {    	
        this.setTitle("�������Oextends MouseAdapter���O"); 
        this.setLayout(new FlowLayout());
        btn = new Button("���s1");
        this.add(btn);                           
    	
        this.setSize(200,100);      
        this.setVisible(true);     
    }  

    public static void main(String args[])
    {    	
        new ch16_12_1();    	
    }
    
    class CMyListener extends MouseAdapter //�H�۩w���������O�@���ƥ��ť��
    {
    	   
    }
    
    
    
        
}