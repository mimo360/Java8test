/*  �ɦW:ch16_14.java          �\��:Lambda�B�⦡���NactionPerformed(ActionEvent e)  */

package myJava.ch16;
import java.lang.*;
import java.awt.*;           //���JAWT���O�w
import java.awt.event.*;     //���JAWT�ƥ����O�w

public class ch16_14  extends Frame
{         
    Button btn;

    public ch16_14()
    {    	
        this.setTitle("��Lambda�B�⦡��@�����{��"); 
        this.setLayout(new FlowLayout());
        btn = new Button("���s1");
        this.add(btn);                 //�Nbtn�[�J����

        //�U�ӱԭz�A�HLambda�B�⦡�]�pactionPerformed(ActionEvent e)
        btn.addActionListener((ActionEvent e) ->  
            {
                if(btn.getLabel()=="���s1")
                   btn.setLabel("btn1");
                else
                   btn.setLabel("���s1");
            } 	
        );

        this.addWindowListener( new WindowAdapter()  
        {
            public void windowClosing(WindowEvent e)  
            {
                System.exit(0);  //��������
            }  	
        } ); 
    	
        this.setSize(200,100);      
        this.setVisible(true);     
    }  

    public static void main(String args[])
    {    	
        new ch16_14();    	
    }
}