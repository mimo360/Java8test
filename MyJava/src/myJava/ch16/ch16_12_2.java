/*  �ɦW:ch16_12_2.java          
    �\��:���U�ƥ��ť��  */

package myJava.ch16;
import java.lang.*;
import java.awt.*;         
import java.awt.event.*;   

public class ch16_12_2  extends Frame
{     
    Button btn;
    public ch16_12_2()
    {    	
        this.setTitle("�������Oextends MouseAdapter���O"); 
        this.setLayout(new FlowLayout());
        btn = new Button("���s1");
        this.add(btn);                           
        btn.addMouseListener(new CMyListener());   //���U�ƥ��ť��
        this.setSize(200,100);      
        this.setVisible(true);     
    }  

    public static void main(String args[])
    {    	
        new ch16_12_2();    	
    }
    
    class CMyListener extends MouseAdapter 
    {
    	   
    }    
    
    
    
        
}