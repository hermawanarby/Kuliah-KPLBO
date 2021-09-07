package classObject;

public class LecturerMain {

	public static void main(String[] args) {
		System.out.println("Daftar Dosen \n");
		
		// instansiasi objek lec1
		Lecturer lec1 = new Lecturer(); 
		lec1.name = "Ahmad Yani";
		lec1.lecturerId = "645";
		
		System.out.println("Name: " + lec1.name);
		System.out.println("Lecturer ID: " + lec1.lecturerId);
		System.out.println("-------------------");
		
		// instansiasi objek lec2
		Lecturer lec2 = new Lecturer(); 
		lec2.name = "Roni Muliawan";
		lec2.lecturerId = "234";
		
		System.out.println("Name: " + lec2.name);
		System.out.println("Lecturer ID: " + lec2.lecturerId);
		System.out.println("-------------------");
		
		// instansiasi objek lec3
		Lecturer lec3 = new Lecturer(); 
		lec3.name = "Rio Harianto";
		lec3.lecturerId = "167";
		
		System.out.println("Name: " + lec3.name);
		System.out.println("Lecturer ID: " + lec3.lecturerId);
		System.out.println("-------------------");
		
	}

}
