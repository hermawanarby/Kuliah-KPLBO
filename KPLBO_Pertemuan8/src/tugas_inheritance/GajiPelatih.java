package tugas_inheritance;

public class GajiPelatih extends Gaji {
	
	// Untuk menampung nilai bonusJuara
	private int bonusJuara;
	
	// Konstruktor default
	public GajiPelatih() {
		// Memanggil konstruktor super class Gaji
		super(); 
	}
	
	// Konstruktor satu parameter
	public GajiPelatih(int gaji) {
		super(gaji);
	}
	
	// Konstruktor dua parameter
	public GajiPelatih(int gaji, int bonusJuara) {
		super(gaji);
		this.bonusJuara = bonusJuara;
	}
	
	@Override
	// Fungsi hitungGaji() ini berfungsi untuk menampilkan hasil penjumlahan dari fungsi hitungGaji() yang ada di kelas induk dengan atribut bonusJuara.
	public int hitungGaji() {
		// Menjumlahkan gaji dengan bonusJuara, fungsi hitungGaji() ini yang ada di kelas induk Gaji.
		return super.hitungGaji() + bonusJuara;
	}

	
	// Setter dan Getter
	public int getBonusJuara() {
		return bonusJuara;
	}

	public void setBonusJuara(int bonusJuara) {
		this.bonusJuara = bonusJuara;
	}
}
