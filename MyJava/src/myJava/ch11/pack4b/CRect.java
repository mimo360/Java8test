// �ɦW:���pack4b\CRect.java          
package pack4b;        //���ɮפ������O�ݩ�pack4b���O�w

public class CRect extends pack4a.CShape   //public�~�i�H����L���O�w�ϥ�
{
   protected double len,width;
   public CRect(double i,double j){ len = i; width = j; }
   public void showArea()
   {
        area = len * width;
        System.out.println("Area=" + area);
   }  
}