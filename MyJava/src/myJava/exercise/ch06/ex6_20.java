package myJava.exercise.ch06;
import java.lang.*;

public class ex6_20         //�D���O
{
    public static void main(String args[])
    {                  
     int M[][]={{ 5,10,15,25}
               ,{ 8,18,31,45}
               ,{47,52,65,77}
               ,{69,74,89,92}};     
     int u;       //u���M��ؼЭ�
     int find;
     int loc[]={-1,-1};   //����{�x�}�C,�x�}��}


     for(u=1;u<=100;u++) //���մM��1~100
     {
       if(findEle(M,4,u,0,0,loc))
         System.out.println("���"+u+"�b�}�C��["+ loc[0] + "]["+ loc[1] +"]��m��");
       else
         System.out.println("-----------------"+u+" ���b�}�C��");
     }   
    }
    
    
   static boolean findEle(int M[][],int n,int x,int s,int t,int loc[])    //x���M��ؼЭȡA����u,���x�^��true,�䤣��x�^��false
   {
       //...�м��g�{��
   }
}