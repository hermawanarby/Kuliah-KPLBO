package inheritance;

public class Professor extends People {
	private String idProfessor;
	
	public Professor(String name, String address, String idProfessor) {
		super(name, address);
		this.idProfessor = idProfessor;
	}

	public String getIdProfessor() {
		return idProfessor;
	}

	public void setIdProfessor(String idProfessor) {
		this.idProfessor = idProfessor;
	}
	
	public void display() {
		super.display();
		System.out.println("Professor ID: " + idProfessor);
	}
	
}
