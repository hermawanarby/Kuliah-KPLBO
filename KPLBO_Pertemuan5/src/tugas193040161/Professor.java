/*
 * Nama: Hermawan Arby
 * NRP: 193040161
 */
package tugas193040161;

public class Professor {
	private String id;
	private String name;
	
	// Kostruktor tanpa parameter
	public Professor() {
		this.setId("P001");
		this.setName("Ayi Purbasari");
	}
	
	// Kostruktor dua parameter
	public Professor(String id, String name) {
		this.setId(id);
		this.setName(name);
	}
	
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
	
	// Method toString
	public String toString() {
		return "ID Dosen: " + id + 
				"\nNama Dosen: " + name;
	}
}
