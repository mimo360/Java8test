/*  �ɦW:ch15_01.java          �\��:�~���{���s���������O  */

package myJava.ch15;
import java.lang.*;

public class ch15_01        //�D���O
{
    public static void main(String args[])
    {
        //�ŧi�ò��ͤ������O����
        CMyOutClass.CMyInnerClass innerX = (new CMyOutClass(10)).new CMyInnerClass(20);
      
        CMyOutClass outY = new CMyOutClass(100); //�ŧi�ò��ͥ~�����O����
        //�o�ˤ]�i�H���ͤ������O������
        CMyOutClass.CMyInnerClass innerY = outY.new CMyInnerClass(200);  
   
        innerX.innerShow("��17�檺�I�s");
        innerY.innerShow("��18�檺�I�s");        
    } 
}       

class CMyOutClass
{
    private int outVar;
    public CMyOutClass(){}                 //�~�����O���غc�l
    public CMyOutClass(int i){outVar=i;}   //�~�����O���غc�l 
    class CMyInnerClass  //�������O���w�q
    {
        private int innerVar;
        public CMyInnerClass(){}                //�������O���غc�l
        public CMyInnerClass(int i){innerVar=i;}//�������O���غc�l
        public void innerShow(String str)
        {      
        //�iŪ���~�����O������
            System.out.println(str + ",run�������O�禡 outVar=" + outVar);
            System.out.println(str + ",run�������O�禡 innerVar=" + innerVar);
        }    
    }      
}