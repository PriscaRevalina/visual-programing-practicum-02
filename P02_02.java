//12S23039-Prisca Manurung
import java.util.*;
import java.lang.Math;

class P02-02 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String namagudang, aC, lantai, ketersediaanteknologi, kualitasGudang;
        int kapasitasgudang, jumlahbukusaatini, skorGudang;

        namagudang = input.nextLine();
        kapasitasgudang = input.nextInt();
        jumlahbukusaatini = input.nextInt();
        aC = input.nextLine();
        lantai = input.nextLine();
        ketersediaanteknologi = input.nextLine();
        skorGudang = (int) ((double) jumlahbukusaatini / kapasitasgudang * 100);
        if (skorGudang >= 40) {
            kualitasGudang = "Gudang Elite";
        } else {
            if (skorGudang >= 25) {
                kualitasGudang = "Gudang Standar";
            } else {
                if (skorGudang < 25) {
                    kualitasGudang = "Gudang Perlu Peningkatan";
                }
            }
        }
        System.out.println("Informasi Gudang");
        System.out.println(namagudang + " | " + kapasitasgudang + " | " + jumlahbukusaatini + " | " + aC + " | " + lantai + " | " + ketersediaanteknologi + " | " + skorGudang + " | " + kualitasGudang);
    }
}

