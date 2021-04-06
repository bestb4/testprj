package testprj;

public class Granduer {
		
		public String color;
		public String gear;
		public int price;
		
		public Granduer() {
		System.out.println("Granduer constructor");
		}
		
		public void run() {
			System.out.println("--run--");
			
		}
		public void stop() {
			System.out.println("--stop--");
		}
		public void info() {
			System.out.println("--info--");
			System.out.println("color:"+color);
			System.out.println("gear:"+gear);
			System.out.println("price:"+price);
		}
}
