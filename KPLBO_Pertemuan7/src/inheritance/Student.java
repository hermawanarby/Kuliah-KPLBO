package inheritance;

public class Student {
	private String name;
	private String studentId;
	
	
	// Konstruktor 
	public Student() {
		
	}
	
	public Student(String name, String studentId) {
		this.name = name;
		this.studentId = studentId;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	

	public void display() {
		System.out.println("Name: " + name + 
				"\nStudentID: " + studentId);
	}
	
}
