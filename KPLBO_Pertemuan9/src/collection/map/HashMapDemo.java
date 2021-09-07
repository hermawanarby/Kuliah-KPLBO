package collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<String, Mahasiswa> hm = new HashMap<String, Mahasiswa>();
		
		Mahasiswa mhs1 = new Mahasiswa();
		mhs1.setNpm("001");
		mhs1.setNama("Adi");
		
		hm.put(mhs1.getNpm(), mhs1);
		
		
		Mahasiswa mhs2 = new Mahasiswa();
		mhs2.setNpm("002");
		mhs2.setNama("Budi");
		
		hm.put(mhs2.getNpm(), mhs2);
		
		Mahasiswa mhsResult1 = hm.get("001");
		
//		System.out.println(mhsResult1.getNpm() + ":"+mhsResult1.getNama());
//		----------------------------------------------------------------------
//		Set<String> keySet = hm.keySet();
//		Iterator<String> iter = keySet.iterator(); 
//		
//		while (iter.hasNext()) {
//			String key = iter.next();
//			Mahasiswa mhs = hm.get(key);
//			System.out.println(mhs.getNpm() + " : " + mhs.getNama());
//		}
//		---------------------------------------------------------------------
		hm.forEach((k, v)->{
			System.out.println(v.getNpm() + " : " + v.getNama());
		});
		
	}
}
