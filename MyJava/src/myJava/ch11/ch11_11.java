/*  �ɦW:ch11_11.java          �\��:String�r�ꪺ�[��  */

package myJava.ch11;
import java.lang.*;

public class ch11_11         //�D���O
{
    public static void main(String args[])
    {
        String str1 = "test"; 
        String str2 = "test"; 
        if(str1==str2)        //���׬�true,�]�����V�P�@�Ӧr��
           System.out.println("str1�Pstr2���V�P�@�Ӧr�ꪫ��");
          
 //----------------------------------------------------------------       
        String str3 = new String("abc"); 
        String str4 = new String("abc"); 
        if(str3==str4)       //���׬�false,�]�����V���P�r�ꪫ��
           System.out.println("str3�Pstr4���V�P�@�Ӧr�ꪫ��");
        else
           System.out.println("str3�Pstr4���V���P�r�ꪫ��");
        if(str3.equals(str4))   //���׬�true
           System.out.println("str3�Pstr4���e�ۦP");
           
 //----------------------------------------------------------------
        String str5 = "Hello";
        String str6 = "World";
        String str7 = "HelloWorld";
        String str8;
        str8 = str5 + str6;
        String str9 = (str5 + str6).intern();
        if(str7 == str8)      //���׬�false,�]�����V���P�r�ꪫ��
           System.out.println("str7�Pstr8���V�P�@�Ӧr�ꪫ��");
        else
           System.out.println("str7�Pstr8���V���P�r�ꪫ��");  
        if(str7.equals(str8))   //���׬�true
           System.out.println("str7�Pstr8���e�ۦP");    
        if(str7 == str9)      //���׬�true,�]�����V�P�@�Ӧr�ꪫ��
           System.out.println("str7�Pstr9���V�P�@�Ӧr�ꪫ��");       
    } 
}