package tugas_inheritance;

public class Gaji {
	
	// Untuk menampung nilai gaji
	private int gaji;
	
	// Konstruktor default
	public Gaji() {
		gaji = 0;
	}
	
	// Konstruktor satu parameter
	public Gaji(int gaji) {
		this.gaji = gaji;
	}
	
	// Untuk mengembalikan nilai gaji
	public int hitungGaji() {
		return gaji;
	}

	// Setter dan Getter
	public int getGaji() {
		return gaji;
	}

	public void setGaji(int gaji) {
		this.gaji = gaji;
	}
}
