/*  �ɦW:ch15_04.java  �\��:�z�L�~�����O���غc�l�s���������O������  */

package myJava.ch15;
import java.lang.*;

public class ch15_04        //�D���O
{
    public static void main(String args[])
    {
        ch15_04 obj = new ch15_04(); //�إߥD���O���������,�|�۰ʩI�s�غc�l
        obj.objInner.innerVar=50;    //�s���������O������馨��
        obj.objInner.innerShow();    //�I�s�������O������馨��  
    }
    public ch15_04()            //�b�غc�l�����ͤ������O���������
    {
        objInner = new CMyInnerClass();
    }
    public CMyInnerClass objInner;  //objInner�O�~�����O���@�����(field)
    class CMyInnerClass  //�����Q�ŧi��ststic
    {
        public int innerVar;
        public CMyInnerClass(){innerVar=20;}
        public void innerShow()
        {
            System.out.println("�������O�禡���椤 innerVar=" +innerVar); 
        }
    } 
}