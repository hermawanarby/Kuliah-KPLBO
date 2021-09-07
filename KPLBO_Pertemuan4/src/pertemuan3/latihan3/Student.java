package pertemuan3.latihan3;

import latihan1.Course;

public class Student {
	private String name;
	private String studentId;
	private Professor advisor;
	double gpa;
	private Course course;
	
	// Method pengecekan GPA
	public void checkGpa(String name) {
		if (getGpa() >= 3.5) {
			System.out.println(name + " Cumlaude");
		} else {
			System.out.println(name + " Not Cumlaude");
		}
	}
	
	// Methode overloading
	public boolean checkGpa() {
		if (getGpa() >= 3.5) {
			return true;
		} else {
			return false;
		}
	}
	
	public void display() {
		System.out.println("Name: " + name + "Student ID: " + studentId);
	}	
	
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
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
}
