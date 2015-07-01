package myJava.exercise.ch13;
import java.lang.*;

public class ex13_05         //�D���O
{
    public static void main(String args[])
    {    	  
    	  CSell.printAll();//�q��e
    	  
    	  CSell objArr[] = new CSell[10];
    	  for(int i=0;i<objArr.length;i++)
    	  {
    	      objArr[i] = new CSell();    	     
    	  }
    	  for(int i=0;i<objArr.length;i++)
    	  {
    	      //objArr[i].start();   //�אּ�h�����
    	      objArr[i].toOrder();   //�אּ�h�������бN���]������
    	  } 
    	      	  
    	  try  {Thread.sleep((long)(30000*Math.random())); } //sleep������L�]���ɭPThread�Q�Ȱ�
	  catch(InterruptedException e){}
	  CSell.printAll();//�q���
    }        
}    

class CSell
{                               
    public static boolean seat[] = new boolean[20];
    
    public CSell()
    {    	   	 
    }    
    
    public static void toOrder() 
    {
         int r=-1;
         do
	 {
	  r = (int)(20*Math.random());
	  if(CSell.seat[r]==false)
	  {	     
	     try  {Thread.sleep((long)(1000*Math.random())); } //sleep������L�]���ɭPThread�Q�Ȱ�
	     catch(InterruptedException e){}	     
	     CSell.seat[r] = true;	     
	     break;
	  }	 
	 }while(r >=0 && CSell.seat[r]==true);
	 System.out.println("�q������,��" + Thread.currentThread().getName() +"�d�i��X�y��,�s����" + r);  
    }
    
    public static void printAll()
    {
    	for(int i=0;i<20;i++)  //�q��e
    	{
    	      if(CSell.seat[i]==true)
    	         System.out.print("��X\t");
    	      else
    	         System.out.print("�Ŧ�\t");    	      
    	} 
    } 
       
}