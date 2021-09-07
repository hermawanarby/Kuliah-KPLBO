package inheritance;

public class GraduateStudent extends Student {
	private String underGraduateInstitution;
	
	public GraduateStudent(String underGraduateInstitution) {
		this.underGraduateInstitution = underGraduateInstitution;
	}
	
	public GraduateStudent(String name, String studentId, String underGraduateInstitution) {
		super(name, studentId);
		this.underGraduateInstitution = underGraduateInstitution;
	}
	
	// Setter dan Getter
	public String getUnderGraduateInstitution() {
		return underGraduateInstitution;
	}
	public void setUnderGraduateInstitution(String underGraduateInstitution) {
		this.underGraduateInstitution = underGraduateInstitution;
	}
	
	public void display() {
		super.display();
		System.out.println("Under Graduate Institution: " + underGraduateInstitution);
	}
}
