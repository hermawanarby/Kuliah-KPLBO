package latihan1;

import pertemuan3.latihan3.Professor;
import pertemuan3.latihan3.Student;

public class Main {

	public static void main(String[] args) {
		System.out.println("Materi Interaksi Antar Objek, Contoh kelas Student dan Professor");
		System.out.println("--------------------------------------");
		
		// Instasiasi objek std1
		Student std1 = new Student();
		std1.setName("Hermawan Arby");
		std1.setStudentId("101");
		std1.setGpa(4.0);
		
		// Instansiasi objek p1
		Professor p1 = new Professor();
		p1.setName("Ms. Rima");
		p1.setLecturerId("193001");
		
		std1.setAdvisor(p1);
		System.out.println("Student's Name: " + std1.getName());
		System.out.println("Student's ID: " + std1.getStudentId());
		System.out.println("Student's Advisor Name: " + std1.getAdvisor().getName());
		System.out.println("Student's Advisor ID: " + std1.getAdvisor().getLecturerId());
		System.out.println("Student's GPA: " + std1.getGpa());
		
		System.out.println("--------------------------------------");
		
		// Instasiasi objek std2
		Student std2 = new Student();
		std2.setName("Alexander");
		std2.setStudentId("102");
		std2.setGpa(3.0);
		
		std2.setAdvisor(p1);
		System.out.println("Student's Name: " + std2.getName());
		System.out.println("Student's ID: " + std2.getStudentId());
		System.out.println("Student's Advisor Name: " + std2.getAdvisor().getName());
		System.out.println("Student's Advisor ID: " + std2.getAdvisor().getLecturerId());
		System.out.println("Student's GPA: " + std2.getGpa());
		
		System.out.println("--------------------------------------");
		
		// the first way to get gpa
		std1.checkGpa(std1.getName());
		std2.checkGpa(std2.getName());
		
		System.out.println("--------------------------------------");
		
		// the second way to get gpa 
		boolean yudisium = false;
		yudisium = std1.checkGpa();
		yudisium = std2.checkGpa();
		System.out.println(std1.getName() + " " + yudisium);
		System.out.println(std2.getName() + " " + yudisium);
		
		System.out.println("--------------------------------------");
		
		// Course for student 1
		Course c1 = new Course();
		c1.setName("KPLBO");
		c1.setCourseId("IF001");
		c1.setCredit(3);
		std1.setCourse(c1);
		System.out.println("Mata Kuliah yang diambil " + std1.getName());
		System.out.println("Nama Matkul: " + std1.getCourse().getName());
		System.out.println("ID Matkul: " + std1.getCourse().getCourseId());
		System.out.println("SKS: " + std1.getCourse().getCredit());
		
		System.out.println("--------------------------------------");
		
		// Course for student 2
		Course c2 = new Course();
		c2.setName("PAM");
		c2.setCourseId("IF002");
		c2.setCredit(3);
		std2.setCourse(c2);
		System.out.println("Mata Kuliah yang diambil " + std2.getName());
		System.out.println("Nama Matkul: " + std2.getCourse().getName());
		System.out.println("ID Matkul: " + std2.getCourse().getCourseId());
		System.out.println("SKS: " + std2.getCourse().getCredit());
		
	}

}
