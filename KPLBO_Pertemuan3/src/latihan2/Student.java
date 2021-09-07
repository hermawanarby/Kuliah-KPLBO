package latihan2;

public class Student {
	private String name;
	private String studentId;
	
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
		System.out.println("Name: " + name + "Student ID: " + studentId);
	}
}
