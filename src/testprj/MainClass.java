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
	
	//자동(묵시적)형 변환:
	//작은 공간의 메모리에서 큰 공간의 메모리로 이동
	byte by =10;
	int in = by;
	System.out.println("in="+in);
	
	//명시적 형 변환
	//큰 공간의 메모리에서 작은 공간의 메모리로 이동
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
	
	
	//서식 문자
	System.out.println("내일 기온은 10도 입니다.");
	System.out.printf("내일 기온은 %d도 입니다.\n",10);
	
	int num1=20;
	System.out.println("내일 기온은 "+num1+"도 입니다.");
	System.out.printf("내일 기온은 %d도 입니다.\n",num1);
	
	System.out.printf("홍길동:%d학년 %d반 %d번\n",6,2,10);
	
	
	//정수
	int num2=30;
	System.out.printf("num2(10진수):%d\n",num2);
	System.out.printf("num2(8진수):%o\n",num2);
	System.out.printf("num2(16진수):%x\n",num2);
	
	
}
}
