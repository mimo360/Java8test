/*  �ɦW:ch8_08.java      �\��:�����O���A�ܼưѦҤl���O������骺����  */

package myJava.ch08;
import java.lang.*;

public class ch8_08         //�D���O
{
    public static void main(String args[])
    {    	
      	CShape objArr[] =  new CShape[4];
      	objArr[0] = new CRect(10.0,20.0);
      	objArr[1] = new CRect(5.0,15.0);
      	objArr[2] = new CCircle(3.0);
      	objArr[3] = new CCircle(6.0);    	
    	
      	for(int i=0;i<objArr.length;i++)
            objArr[i].computeArea();
        
      	System.out.println("���󪺭��n�p�U");
      	CShape.show(objArr);         //��ܭ��n   
      	CShape.sortByArea(objArr);   //�i��Ƨ�   
      	System.out.println("����̭��n�Ƨǫ�p�U");
      	CShape.show(objArr);         //��ܭ��n     
    } 
}    

class CShape
{
    protected double area;
    
    public static void show(CShape objArr[])
    {
      	for(int i=0;i<objArr.length;i++)
      	      	System.out.print(objArr[i].area + "\t");
      	System.out.println();    	
    }
    public static void sortByArea(CShape objArr[])   //�Ƨ�
    {
         int k,times;
         CShape temp;
         k = objArr.length - 1;
         while(k!=0)
         { 
           times = 0;
           for(int i=0;i<=k-1;i++)
           {
             if(objArr[i].area > objArr[i+1].area)
             {
              temp = objArr[i];    objArr[i] = objArr[i+1];
              objArr[i+1] = temp;  times = i;
             }
           }
           k = times;
         }
    }
    public void computeArea() {}
}

class CRect extends CShape   // ���OCRect�~�Ӧ����OCShape
{
    protected double length,width;
    public CRect(double i,double j)
    {
      	length = i;
      	width = j;
    }
    @Override public void computeArea()
    {
      	area = length * width;
    }    
}

class CCircle extends CShape   // ���OCCircle�~�Ӧ����OCShape
{
    protected double radius;
    protected final double pi=3.14;
    public CCircle(double i)
    {
      	radius = i;    	
    }
    @Override public void computeArea()
    {
      	area = radius * radius * pi;
    }    
}
