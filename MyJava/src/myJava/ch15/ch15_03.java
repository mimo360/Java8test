/*  �ɦW:ch15_03.java          �\��:�N�������O�h�[�@�h�ʸ�  */

package myJava.ch15;
import java.lang.*;

public class ch15_03        //�D���O
{
    public static void main(String args[])
    {
        CMyOutClass outX = new CMyOutClass(); //�ŧi�ò��ͥ~�����O����
        //CMyOutClass.CMyInnerClass innerX = outX.new CMyInnerClass();     
    
        outX.runInnerMethod();  //�N���Ͱ��浲�G�Ĥ@�檺��X 
        outX.changeInnerVar();  //�N���ܤ������O���󦨭�
        outX.printInnerVar();   //�N���Ͱ��浲�G�ĤG�檺��X 
        outX.runInnerMethod();  //�N���Ͱ��浲�G�ĤT�檺��X  
    } 
}       

class CMyOutClass
{
    private class CMyInnerClass  //private���Ū��������O�w�q
    {
        public int innerVar;
        public CMyInnerClass(){innerVar=20;}
        public void innerShow()
        {
            System.out.println("�������O�禡���椤 innerVar=" + innerVar); 
        }
    }
    
    public CMyInnerClass objInner;  //�H�������O�@����ƫ��A�ŧi�����ܼ�
    public CMyOutClass()            //�~�����O���غc�l
    {
        objInner = new CMyInnerClass();  //���ͤ������O���������
    }
    public void printInnerVar()
    {
        System.out.println("�~�����O�禡���椤 innerVar=" + objInner.innerVar);
    } 
  
    public void changeInnerVar()
    {   
        //�]�����������O������objInner������,�ҥH�iŪ���������O������
        objInner.innerVar=50;  
    }
    public void runInnerMethod()
    {
        //�]�����������O������objInner������,�ҥH�i���椺�����O������	
        objInner.innerShow();//���T���ԭz
    }
}