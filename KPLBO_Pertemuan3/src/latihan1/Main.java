package latihan1;

public class Main {

	public static void main(String[] args) {
		System.out.println("Materi Kelas dan Objek : Kelas Mahasiswa");
        
        // instansiasi objek std1
        Student std1 = new Student(); // Student() = konstruktor dari kelas Student
        //std1.name = "Billy";
        std1.setName("Billy");
        std1.setStudentId("101");  
        
        //System.out.println(std1.name);
        System.out.println(std1.getName());
        System.out.println(std1.getStudentId());
        std1.display();
        
        // instansiasi objek std2
        Student std2 = new Student();
        std2.setName("Willy");
        std2.setStudentId("102");  
        System.out.println(std2.getName());
        System.out.println(std2.getStudentId());
        
        // instansiasi objek std3
        Student std3 = new Student();
        std3.setName("Prilly");
        std3.setStudentId("103");  
        System.out.println(std3.getName());
        System.out.println(std3.getStudentId());

	}

}
