package newpackage;
public class testprj2 {
public static void main(String[] args) {
	
	
	int x = 10;
	int y = 20;
	//���մ��� ������
		x=10;
		System.out.println("x += 10:"+(x+=10));
		x=10;
		System.out.println("x -= 10:"+(x-=10));
		x=10;
		System.out.println("x *= 10:"+(x*=10));
		x=10;
		System.out.println("x /= 10:"+(x/=10));
		x=10;
		System.out.println("x %= 10:"+(x%=10));
		
		//���� ������
		x=10; y=20;
		System.out.println("x>y:"+(x>y));
		System.out.println("x<y:"+(x<y));
		System.out.println("x>=y:"+(x>=y));
		System.out.println("x<=y:"+(x<=y));
		System.out.println("x==y:"+(x==y));
		System.out.println("x!=y:"+(x!=y));
		
	//����������
	x=10;
	System.out.println("++x:"+(++x));
	x=10;
	System.out.println("--x:"+(--x));
	x=10;
	System.out.println("x++:"+(x++));
	System.out.println("x:"+x);
	x=10;
	System.out.println("x--:"+(x--));
	System.out.println("x:"+x);


	//�� ������
	boolean b1 = false;
	boolean b2 = true;
	System.out.println("b1&&b2:"+(b1 && b2));
	System.out.println("b1||b2:"+(b1||b2));
	System.out.println("!b1:"+!b1);
	System.out.println("!b2:"+!b2);


	//����(����)������
	x=10;y=20;
	int result = (x>y) ? 100 : 200;
	System.out.println("result:"+ result);

	result = (x<y) ? 100 : 200;
	System.out.println("result:"+ result);

	result = (x==y) ? 100:200;
	System.out.println("result:"+ result);
}
}
