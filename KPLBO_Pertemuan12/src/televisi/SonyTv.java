package televisi;

import java.util.*;

public class SonyTv implements Televisi {
    List<String> listSaluran;

    public SonyTv() {
        listSaluran = new ArrayList<>();
        listSaluran.add("RCTI");
        listSaluran.add("SCTV");
        listSaluran.add("Indosiar");
        listSaluran.add("TVRI");
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

