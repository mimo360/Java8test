/*  �ɦW:ch14_01.java          �\��:�x����k  */

package myJava.ch14;
import java.lang.*;


public class ch14_01         //�D���O
{
    public static void main(String args[])
    {
        CMyclass obj1 = new CMyclass();
  	
        System.out.println("�̫�@�Ӭ�" + obj1.last(2.7D,3.3D));
        System.out.println("�̫�@�Ӭ�" + obj1.last(2,3,7));
        System.out.println("�̫�@�Ӭ�" + 
                             obj1.last("Good","morning","sir"));
    } 
}

class CMyclass
{
    public <M> M last(M a,M b)
    {   
        return b;     
    }  
    public <N> N last(N a,N b, N c)
    {   
        return c;     
    }  
}
