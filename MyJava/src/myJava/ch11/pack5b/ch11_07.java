/*  �ɦW:���pack5b\ch11_07.java          �\��:�l���O�w  */

package pack5b;        //���ɮפ������O�ݩ�pack5b���O�w

import pack5a.subpacka.CCircle;   //�פJ���O�w
import pack5a.subpackb.CRect;     //�פJ���O�w

public class ch11_07         //�D���O
{
    public static CCircle obj1;
    public static CRect obj2;
    public static void main(String args[])
    {
        obj1 = new CCircle(5.0);
        obj1.showArea(); 
        obj2 = new CRect(5.0,3.0);
        obj2.showArea();  
    } 
}