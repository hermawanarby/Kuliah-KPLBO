package inheritance;

public class MainTest {
	public static void main(String[] args) {
		Student s1 = new Student("Mary", "1");
		GraduateStudent s2 = new GraduateStudent("Suzy", "2", "UNPAS");
		Student s3 = new Student("Roy", "3");
		Student s4 = new Student("Boy", "4");
		
		s1.display();
		System.out.println("---------------------");
		s2.display();
		System.out.println("---------------------");
		s3.display();
		System.out.println("---------------------");
		s4.display();
		System.out.println("---------------------");
	}
}
