/*  �ɦW:ch16_01.java       �\��:AWT Frame-�����{��  (�D���O�~�Ӥ覡)  */

package myJava.ch16;
import java.lang.*;
import java.awt.*;     //���JAWT���O�w

public class ch16_01  extends Frame      //�D���O�~��Frame���O
{
    public ch16_01()
    {
        this.setTitle("�o�OAWT����"); //�]�w���������D�C
        this.setSize(300,200);        //�]�w�������e�P��
        this.setVisible(true);        //�]�w�����O�_�i�Q�ݨ�
    }

    public static void main(String args[])
    {
        new ch16_01();
    } 
}