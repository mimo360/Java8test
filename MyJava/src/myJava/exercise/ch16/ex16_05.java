package myJava.exercise.ch16;
import java.lang.*;
import java.awt.*;     //���JAWT���O�w

public class ex16_05 extends Frame      //�D���O�~��Frame���O
{       
    
    Button numBtnArr[] = new Button[10];        //10�ӼƦr���s������}�C
    Button funcBtnArr[] = new Button[4];        //4�ӥ\����s������}�C
    Button specFuncBtnArr[] = new Button[3];    //3�ӯS��\����s������}�C
    
    
    Label lab;                               //��ܭp�⵲�G������
    
    public ex16_05()
    {    	 	
    	String numArr[] = {"0","1","2","3","4","5","6","7","8","9"};
    	String funcArr[] = {"+","-","*","/"};
    	String specFuncArr[] = {"��","CE","="};
    	
    	
    }
    
    public static void main(String args[])
    {
    	new ex16_05();    	
    }
}