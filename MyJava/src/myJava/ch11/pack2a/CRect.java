// �ɦW:���pack2a\CRect.java          
package pack2a;        //���ɮפ������O�ݩ�pack2a���O�w

public class CRect  //�ŧi��public�~�i�H����L���O�w�ϥ�
{
   protected double area;
   protected double len,width;
   public CRect(double i,double j){ len = i; width = j; }
   public void showArea()
   {
        area = len * width;
        System.out.println("Area=" + area);
   }  
}