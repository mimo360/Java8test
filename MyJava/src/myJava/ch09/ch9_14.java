/*   �ɦW:ch9_14.java          �\��:�}�C�PObject���A�����A�ഫ  */

package myJava.ch09;
import java.lang.*;

public class ch9_14         //�D���O
{
    public static void main(String args[])
    {
        int[][] ary1 = new int[][]{{1,2,3},{4,5,6}};//�G���}�C����
        Object obj1;
        obj1 = (Object)ary1;    //���A�ഫ
        System.out.println("ary1����toString=" + ary1.toString());
        System.out.println("obj1����toString=" + obj1.toString());
        
        int[][] ary2 = (int[][]) obj1; //�ŧi�G���}�C�ѦҨöi�櫬�A�ഫ
        System.out.println("ary1[1][1]=" + ary1[1][1]);
        System.out.println("ary2[1][1]=" + ary2[1][1]);
    } 
}