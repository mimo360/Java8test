// �ɦW:���pack1\abc.java         
package pack1;        //���ɮפ������O�ݩ�pack1���O�w

class CRect
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