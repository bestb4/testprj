package testprj;

public class MainClass {
	public static void main(String[] args) {
		
		
			
			ChildClass child1 = new ChildClass();
			
			child1.getInfo(); 
			child1.getInfo(10,20);
			child1.getInfo("lemon","apple");
		
		
			ObjectClass obj1 = new ObjectClass();
			ObjectClass obj2 = new ObjectClass();
			ObjectClass obj3 = new ObjectClass();
			
			System.out.println("obj1--->"+obj1);
			System.out.println("obj2--->"+obj2);
			System.out.println("obj3--->"+obj3);
		}
}
	

