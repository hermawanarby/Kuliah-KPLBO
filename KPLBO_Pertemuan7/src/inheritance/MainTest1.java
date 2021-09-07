package inheritance;

public class MainTest1 {
	public static void main(String[] args) {
		People p1 = new People();
		p1.setName("Suzy");
		p1.setAddress("Bandung");
		p1.display();
		
		System.out.println("------------------");
		
		Professor pr1 = new Professor("Alex", "Jakarta", "123");
		pr1.display();
	}
}
