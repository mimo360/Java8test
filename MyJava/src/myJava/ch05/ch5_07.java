/*   �ɦW:ch5_07.java       �\��:�ƻs�����}�C   */

package myJava.ch05;
import java.lang.*;

public class ch5_07         //�D���O
{
    public static void main(String args[])
    {
        char[] ary1={'T','h','e','J','a','v','a','2'};
        char[] ary2={'H','e','l','l','o',' ','T','i','m','e','!'};

        System.arraycopy(ary1,3,ary2,6,4);
        for(char element :  ary2)
           System.out.print(element);
    }
}