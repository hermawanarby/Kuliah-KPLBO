package tugas_inheritance;

public class GajiPelatihMain {
/*
 * Program menghitung gaji pelatih sepakbola.
 */
	public static void main(String[] args) {
		// Instansiasi objek gp1 yang memiliki satu parameter yaitu gaji 2000000.
		GajiPelatih gp1 = new GajiPelatih(2000000);
		
		// Instansiasi objek gp2 yang memiliki dua parameter yaitu gaji 2000000, dan bonusJuara 10000000.
		GajiPelatih gp2 = new GajiPelatih(1500000, 10000000);
		
		// Menampilkan gaji dari pelatih 1 dan pelatih 2 dengan memanggil fungsi hitungGaji() yang ada di kelas GajiPelatih. 
		System.out.println("Gaji Pelatih 1: " + gp1.hitungGaji());
		System.out.println("Gaji Pelatih 2: " + gp2.hitungGaji());
	}

}
