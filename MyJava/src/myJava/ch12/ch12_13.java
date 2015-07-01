/*  �ɦW:ch12_13.java          �\��:�ǦC��  */

package myJava.ch12;
import java.lang.*;
import java.io.*;

public class ch12_13         //�D���O
{
    public static void main(String args[]) throws IOException,ClassNotFoundException 
    {        
        FileInputStream fi = new FileInputStream("c:\\myJava\\ch12\\file\\file6.tmp");
        ObjectInputStream ois = new ObjectInputStream(fi); 
        CMyStudent obj1;        
        
        obj1 = (CMyStudent)ois.readObject();
        obj1.printSum();
        obj1 = (CMyStudent)ois.readObject();
        obj1.printSum();
        obj1 = (CMyStudent)ois.readObject();
        obj1.printSum();
        
        ois.close();        
        fi.close();       //����
    } 
}

class CMyStudent implements Serializable   //CMyStudent��@Serializable����
{
    private String id;
    private String name;
    private int scoreComputer;
    private int scoreMath;
    private int scoreEnglish;
    private int scoreSum;    
    
    public CMyStudent(String str1,String str2,int i,int j,int k)
    {
    	
        id = str1;
        name = str2;
        scoreComputer = i;
        scoreMath = j;
        scoreEnglish = k;
        computeSum();
        
    }
    public void computeSum() 
    {
        scoreSum = scoreComputer + scoreMath + scoreEnglish;
    }
    public void printSum()     //�ק�method���e,��method���i�ί�
    {
    	System.out.println(id + " " + name + " �`��=" + scoreSum);
    }
}
