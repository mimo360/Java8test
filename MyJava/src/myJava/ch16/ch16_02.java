/*  �ɦW:ch16_02.java          �\��:AWT Frame-�����{��  (���O�����P�禡�ܼƤ覡)  */

package myJava.ch16;
import java.lang.*;
import java.awt.*;     //���JAWT���O�w

public class ch16_02 extends Frame      //�D���O�~��Frame���O
{
    static ch16_02 frm1 = new ch16_02();    //���O����
       
    public static void main(String args[])
    {
        Frame frm2 = new Frame();           //�禡�ܼ�
        frm1.setTitle("�o�O�Ĥ@��AWT����"); //�]�w���������D�C
        frm1.setSize(300,200);              //�]�w�������e�P��    	
        frm1.setVisible(true);              //�]�w�����O�_�i�Q�ݨ�
    	
        frm2.setTitle("�o�O�t�@��AWT����"); //�]�w���������D�C
        frm2.setSize(200,300);              //�]�w�������e�P��
        frm2.setLocation(350,50);           //�]�w��������m
        frm2.setVisible(true);              //�]�w�����O�_�i�Q�ݨ�
    } 
}