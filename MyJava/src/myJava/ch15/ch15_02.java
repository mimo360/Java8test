/*  �ɦW:ch15_02.java          �\��:�~�����O�s���������O����  */

package myJava.ch15;
import java.lang.*;

public class ch15_02        //�D���O
{
    public static void main(String args[])
    {
        CMyOutClass outY = new CMyOutClass(); //�ŧi�ò��ͥ~�����O����
        
        outY.outShow("��12�檺�I�s");
        outY.changeInnerVar("��13�檺�I�s");  
    } 
}       

class CMyOutClass
{
    class CMyInnerClass  //�������O���w�q
    {
        public int innerVar;
        public CMyInnerClass(){innerVar=20;}//�������O���غc�l
        public void innerShow()
        {
            System.out.println("run�������O�禡���椤 innerVar=" + innerVar); 
        }
    }
    
    public int outVar;
    public CMyOutClass(){outVar=10;}   //�~�����O���غc�l
    public void outShow(String str)
    {
        System.out.println(str +",run�~�����O�禡 outVar=" + outVar);
        //innerVar=0;        //���~���ԭz,�]���S���������O���������
    }    
    public CMyInnerClass objInner;  //�H�������O�@����ƫ��A�ŧi�����ܼ�
    public void changeInnerVar(String str)
    {
        objInner = new CMyInnerClass();  //���ͤ������O���������
        System.out.print(str);
        System.out.println(",run�~�����O�禡,�ǳƭק鷺�����O������骺���");
        //�]�����������O������objInner������,�ҥH�iŪ���������O������
        objInner.innerVar=50;//���T���ԭz
        objInner.innerShow();//�I�s�������O�������禡
    }    
}