/*  �ɦW:ch15_05.java          �\��:�ϰ줺�����O  */

package myJava.ch15;
import java.lang.*;

public class ch15_05        //�D���O
{
    public static void main(String args[])
    {
        CMyOutClass outX = new CMyOutClass(); //�ŧi�ò��ͥ~�����O����
        outX.runOutClassMehtod1();
      //CMyOutClass.CMyInnerClass innerX = (new CMyOutClass()).new CMyInnerClass();
    } 
}       

class CMyOutClass
{  
    public void runOutClassMehtod1()
    {     
        class CMyInnerClass  //�ϰ줺�����O�w�q
        {
            public int innerVar;
            public CMyInnerClass(){innerVar=20;}
            public void innerShow()
            {
                System.out.println("�ϰ줺�����O�禡���椤 innerVar=" + innerVar); 
            }
        }
        CMyInnerClass objInner = new CMyInnerClass();
        System.out.println("�~�����O�禡���椤 innerVar=" + objInner.innerVar);
        objInner.innerVar=50;
        objInner.innerShow();
        System.out.println("�~�����O�禡���椤 innerVar=" + objInner.innerVar);
    }
    //CMyInnerClass objInner2;   //���~,����ŧi�ϰ줺�����O�������ܼ�
    public void runOutClassMehtod2()
    {
        //CMyInnerClass objInner2;  //���~,����ŧi�D���ϰ줺�����O�������ܼ� 
    }  
}