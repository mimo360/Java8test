package myJava.exercise.ch08;
import java.lang.*;

public class ex8_03         //�D���O
{
    public static void main(String args[])
    {
        //c�[�J�{���X
        
         for(int i=0;i<objArr.length;i++)
            objArr[i].angle();
         for(int i=0;i<objArr.length;i++)
            System.out.println(objArr[i].toString());
         
    }    
}    

abstract class CShape                          //��H���O
{
  public int number;                   //���
  public int totalAngle;       //�����M,������totalAangle=(number-2)*180
  public abstract void angle();        //��H��k
  
  //b�[�J�{���X
  
}

//a�[�J�{���X
