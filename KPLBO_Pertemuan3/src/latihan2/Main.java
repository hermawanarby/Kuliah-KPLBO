package latihan2;

public class Main {

	public static void main(String[] args) {
		System.out.println("Materi Variabel Referensi");
		
		Student x = new Student();
		Student y = x;
		
		x.setStudentId("1");
		y.setStudentId("2");
		System.out.println(x.getStudentId()); //2
		
		Student z = new Student();
		z.setStudentId("3");
		x = z;
		System.out.println(x.getStudentId()); //3
		System.out.println(y.getStudentId()); //2
		
		z = y;
		z.setStudentId("4");
		System.out.println(x.getStudentId()); //3
		System.out.println(y.getStudentId()); //4
		System.out.println(z.getStudentId()); //4
	}
	
}
