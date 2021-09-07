package televisi;

import java.util.*;

public class SamsungTv implements Televisi{
    List<String> listSaluran;

    public SamsungTv() {
        listSaluran = new ArrayList<>();
        listSaluran.add("HBO");
        listSaluran.add("Disney Junior");
        listSaluran.add("Forx Crime");
        listSaluran.add("Nat Geo");
        listSaluran.add("Waku Waku");
    }

    @Override
    public void pindahSaluran(int nomor) {
        if (nomor <= Televisi.MAX_SALURAN) {
            if (listSaluran.size()-1 > nomor) {
                System.out.println("Pindah Saluran: " + listSaluran.get(nomor));

            } else {
                System.out.println("Saluran tidak dikenal");
            }
        } else {
            System.out.println("Saluran terlalu besar");
        }
    }
}
