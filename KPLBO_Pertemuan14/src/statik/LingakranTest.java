package statik;

import java.util.Scanner;

public class LingakranTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		
		if(r >= 0) {
			Lingkaran lingkaran = new Lingkaran();
			System.out.println(lingkaran.hitungLuasLingkaran(r));
		} else {
			System.out.println(ErrorMesg.err1); //variable static
		}
	}
}
