package testprj;

public class MainClass {
public static void main(String[] args) {
	
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
	
	
	//����
	System.out.printf("�ҹ���\'%c\'�� �빮�ڴ� \'%c\'�Դϴ�.\n",'a','A');
	//���ڿ�
	System.out.printf("\'%s\'�� �빮�ڷ� �ٲٸ� \'%s\'�Դϴ�.\n","java","JAVA");
	
	
	//�Ǽ�
	float f=1.23f;
	System.out.printf("f =%f\n",f);
	
	double d=1.23456d;
	System.out.printf("d =%f\n",d);
	
	//���Ĺ��� ���� ���
	System.out.printf("%d\n",123);
	System.out.printf("%d\n",1234);
	System.out.printf("%d\n",12345);
	
	System.out.println();
	System.out.printf("%5d\n",123);
	System.out.printf("%5d\n",1234);
	System.out.printf("%5d\n",12345);
	

	System.out.println();
	//���Ĺ��� �Ҽ��� ���� ���
	System.out.printf("%f\n",1.23);
	System.out.printf("%.0f\n",1.23);
	System.out.printf("%.2f\n",1.23);
	System.out.printf("%.3f\n",1.23);
	
	int x=10;
	int y=20;
	//���Կ�����
	System.out.println("x="+x);
	System.out.println("y="+y);
	
	x=y;
	System.out.println("x="+x);
	System.out.println("y="+y);
	
	x=10; y=20;
	//��� ������
	System.out.println("x+y="+(x+y));
	System.out.println("x-y="+(x-y));
	System.out.println("x*y="+(x*y));
	System.out.println("x/y="+(x/y));
	System.out.println("x%y="+(x%y));
}
}
