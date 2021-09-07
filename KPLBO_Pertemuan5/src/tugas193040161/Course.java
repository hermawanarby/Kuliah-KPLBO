/*
 * Nama: Hermawan Arby
 * NRP: 193040161
 */
package tugas193040161;

public class Course {
	private String id;
	private String name;
	private Professor professor;
	
	// Kostruktor tanpa parameter
	public Course() {
		this.setId("C001");
		this.setName("KPLBO");
	}
	
	// Kostruktor dua parameter
	public Course(String id, String name) {
		this.setId(id);
		this.setName(name);
	}
	
	
	// Getter dan Setter
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Professor getProfessor() {
		return professor;
	}
	
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	// Method toString
	public String toString() {
		return "ID Matkul: " + id + 
				"\nNama Matkul: " + name + 
				"\n" + professor;
	}
	
}
