package testprj;

public class MainClass {
public static void main(String[] args) {
	char c ='a';
	System.out.println("c="+c);
	
	int i = 10;
	System.out.println("i="+i);
	
	double d =10.258;
	System.out.println("c="+c);
	
	boolean b = false;
	System.out.println("b="+b);
	
	String s = "Hello Java World!!";
	System.out.println("s="+s);
	
	//�ڵ�(������)�� ��ȯ:
	//���� ������ �޸𸮿��� ū ������ �޸𸮷� �̵�
	byte by =10;
	int in = by;
	System.out.println("in="+in);
	
	//����� �� ��ȯ
	//ū ������ �޸𸮿��� ���� ������ �޸𸮷� �̵�
	int iVar =100;
	byte bVar = (byte)iVar;
	System.out.println("bVar="+bVar);
	
	iVar=123456;
	bVar=(byte)iVar;
	System.out.println("bVar="+bVar);

	System.out.println("Hello\tWorld"); //\t
	System.out.println("Hello\nWorld"); //\n
	System.out.println("Hello\'World\'");//\'
	System.out.println("Hello\"World\"");//\"
	System.out.println("Hello\\World"); //\\
	
	
	//���� ����
	System.out.println("���� ����� 10�� �Դϴ�.");
	System.out.printf("���� ����� %d�� �Դϴ�.\n",10);
	
	int num1=20;
	System.out.println("���� ����� "+num1+"�� �Դϴ�.");
	System.out.printf("���� ����� %d�� �Դϴ�.\n",num1);
	
	System.out.printf("ȫ�浿:%d�г� %d�� %d��\n",6,2,10);
	
	
	//����
	int num2=30;
	System.out.printf("num2(10����):%d\n",num2);
	System.out.printf("num2(8����):%o\n",num2);
	System.out.printf("num2(16����):%x\n",num2);
	
	
}
}
