package latihan3;

public class Student {
	private String name;
	private String studentId;
	private Professor advisor;
	
	public String getName() {
		return name;
	}
	public Professor getAdvisor() {
		return advisor;
	}
	public void setAdvisor(Professor advisor) {
		this.advisor = advisor;
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
