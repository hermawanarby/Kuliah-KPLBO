package classObject;

public class StudentMain {
	public static void main(String[] args) {
		System.out.println("Daftar Mahasiswa \n");
		
		// instansiasi objek std1
		Student std1 = new Student(); 
		std1.name = "Hermawan Arby";
		std1.studentId = "193040161";
		
		System.out.println("Name: " + std1.name);
		System.out.println("Student ID: " + std1.studentId);
		System.out.println("-------------------");
		
		// instansiasi objek std2
		Student std2 = new Student(); 
		std2.name = "Alex Jubaedi";
		std2.studentId = "193040100";
		
		System.out.println("Name: " + std2.name);
		System.out.println("Student ID: " + std2.studentId);
		System.out.println("-------------------");
		
		// instansiasi objek std3
		Student std3 = new Student(); 
		std3.name = "Ricard Maulana";
		std3.studentId = "193040188";
		
		System.out.println("Name: " + std3.name);
		System.out.println("Student ID: " + std3.studentId);
		System.out.println("-------------------");
	}
}
