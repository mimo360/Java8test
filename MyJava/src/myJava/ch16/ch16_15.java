/*  �ɦW:ch16_15.java          �\��:ActionEvent�ƥ�  */

package myJava.ch16;
import java.lang.*;
import java.awt.*;           //���JAWT���O�w
import java.awt.event.*;     //���JAWT�ƥ����O�w

public class ch16_15  extends Frame
{         
    //�����
    Button btn,btnClr;
    TextField txf;
    Panel pnl;
    Label lab1;
    Label lab2;
    
    public ch16_15()
    {    	
        this.setTitle("ActionEvent�ƥ�");
    	
        //  �����t�m�}�l
        this.setLayout(null);     //��ʰt�m����
        pnl = new Panel();    	
        pnl.setLayout(new GridLayout(0,1));
        pnl.setBackground(Color.YELLOW);
    	
        txf = new TextField(18);  //�]�w���׬�18
        btn = new Button("�d��");
        lab1 = new Label();
        lab2 = new Label();
        btnClr = new Button("�M��");    	
    	
        txf.setBounds(20,35,150,20);
        btn.setBounds(190,35,40,20);
        btnClr.setBounds(190,65,40,20);
        pnl.setBounds(20,65,150,50);
    	
        this.add(txf);    	this.add(btn);
        pnl.add(lab1);    	pnl.add(lab2);
        this.add(pnl);    	this.add(btnClr);    	    	
        //  �����t�m����
    	    	 
        //���U��ť��
        this.addWindowListener(new WindowAdapter()  //�ΦW���O:��������
        {
            public void windowClosing(WindowEvent e)  
            {
                System.exit(0);  //��������
            }  	
        });
        txf.addActionListener(new CMyListener1());     //���U�ƥ��ť��
        btn.addActionListener(new CMyListener1());     //���U�ƥ��ť��
        btnClr.addActionListener((ActionEvent e) ->  //���U�ƥ��ť��
        {   // actionPerformed(ActionEvent e)�ƥ�B�z�{���϶�
            txf.setText("");
            lab1.setText("");   
            lab2.setText("");           
        });  
        //���U��ť�̵���    	    	
    	
        this.setBackground(Color.PINK);
        this.setSize(250,150);      
        this.setVisible(true);     
    }  

    public static void main(String args[])
    {    	
        new ch16_15();    	
    }
    
    //�H�U�������O���ƥ��ť��
    class CMyListener1 implements ActionListener //�۩w�ƥ��ť��1
    {
        public void actionPerformed(ActionEvent e) //�ƥ�B�z���g�B
        {
            lab1.setText(txf.getText());   
            if(e.getSource()==btn)
                lab2.setText("�z���U�F�d�߶s");
            else
                lab2.setText("�z�����U�d�߶s");
        }    
    }
}