/*  �ɦW:ch14_02.java          �\��:�x�����O  */

package myJava.ch14;
import java.lang.*;


public class ch14_02         //�D���O
{
    public static void main(String args[])
    {
        CMyclass<String> obj1 = new CMyclass<String>();  	
        CMyclass<Integer> obj2 = new CMyclass<Integer>(); 
        System.out.println("�Ĥ@�Ӭ�"+obj1.first("Hello","World"));
        System.out.println("�̫�@�Ӭ�"+obj1.last("Hello","World"));
        System.out.println("�Ĥ@�Ӭ�"+obj2.first(7,5));
        System.out.println("�̫�@�Ӭ�"+obj2.last(7,5));
    } 
}

class CMyclass<N>
{
    public N first(N a,N b)
    {   
        return a;     
    }  
    public N last(N a,N b)
    {   
        return b;     
    }    
}
