package myJava.exercise.ch13;
import java.lang.*;

public class ex13_01         //�D���O
{
    public static void main(String args[])
    {    	  
    	     String str1 = new String();
    	     
    	     CDinner Soup = new CDinner("��");
    	     CDinner Salad = new CDinner("�F��");
    	     CDinner Entree = new CDinner("�D��");
    	     CDinner Dessert = new CDinner("���I");    	     
    	     
    	     Soup.start(); 
    	     Salad.start(); 
    	     Entree.start();  
    	     Dessert.start();    	     
    }        
}    

class CDinner 
{                               
    String food;
    public CDinner(String str){ food = str; }    
    
    private void serving()
    {
    	   System.out.println("�W��:" + food);
    }
}