/*   �ɦW:ch11_15.java      �\��:���Ppackage�ϱoprotected���ͧ@��  */

package pack6b;              //ch11_15�PCB�����ݩ�pack6b package
import pack6a.CA;            //�ѩ�n�ϥ�CA,�G�ݭn�ޤJ


public class ch11_15         //�D���O
{
    public static void main(String args[])
    {
        CA objA =  new CA();
        CB objB =  new CB();           //objB�O�l���O����
        System.out.println("��J���OCA��objA������");
        objA.inputX();
        objA.inputY();
        objA.inputZ();
        System.out.print("���OCA��objA����:");
        objA.show();
        System.out.println("-------------------------");
        System.out.println("��J���OCB��objB������");
        objB.inputX();
        objB.inputY();
        objB.inputZ();
        objB.varX++;
        //objB.varY++;        //�~���{���L�k�s��protected���Ÿ��
        objB.addOne();
        System.out.print("���OB��objB����:");
        objB.show();
    } 
}

class CB extends CA   // ���OCB�~�Ӧ����OCA
{
    public int varW;          //�s�W�������ܼ�
    public void addOne()      //�s�W�������禡
    {
        varX++;
        varY++;
        //varZ++;       //�L�k�s�������Oprivate���Ÿ��
    }
}