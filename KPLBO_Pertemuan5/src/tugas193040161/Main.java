/*
 * Nama: Hermawan Arby
 * NRP: 193040161
 */
package tugas193040161;

public class Main {

	public static void main(String[] args) {
		Professor p1 = new Professor();
		System.out.println(p1);
		
		Professor p2 = new Professor("P009", "Sandhika Galih");
		System.out.println(p2);
		
		System.out.println("--------------------------------");
		
		Course c1 = new Course();
		c1.setProfessor(p1);
		System.out.println(c1);
		
	}

}
