package latihan3;

public class Main {

	public static void main(String[] args) {
		System.out.println("Materi Objek Sebagai Atribut");
		System.out.println("-----------------------------");
		
		// Objek dari kelas Student
		Student std = new Student();
		std.setName("Hermawan Arby");
		System.out.println("Student's Name: " + std.getName());
		std.setStudentId("193040161");
		System.out.println("Student's ID: " + std.getStudentId());
		
		// Objek dari kelas Professor
		Professor prof = new Professor();
		std.setAdvisor(prof);
		prof.setName("Dr. Ayi Pubasari, ST., MT");
		prof.setLecturerId("1022200019");
		System.out.println("Student's Advisor Name: " + std.getAdvisor().getName());
		System.out.println("Student's Advisor ID: " + std.getAdvisor().getLecturerId());
	}

}
