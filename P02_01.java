// 12S23039-Prisca Manurung
import java.util.*;
import java.lang.Math;

class P02_01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String namaTugas, kodeMatkul, mataKuliah, dosenPengampu, deadline, nIM, status, rekomendasiTugas;
        int tingkatKesulitan, jumlahHari;
        double prioritas;

        namaTugas = input.nextLine();
        kodeMatkul = input.nextLine();
        mataKuliah = input.nextLine();
        dosenPengampu = input.nextLine();
        deadline = input.nextLine();
        nIM = input.nextLine();
        status = input.nextLine();
        tingkatKesulitan = input.nextInt();
        jumlahHari = input.nextInt();
        prioritas = tingkatKesulitan * (1.0 / jumlahHari);
        System.out.println("Prioritas: " + toFixed(prioritas,2));
        if (prioritas > 3.0) {
            rekomendasiTugas = "Penting! Anda harus mengerjakan tugas ini segera";
        } else {
            if (prioritas >= 1.5 && prioritas <= 3.0) {
                rekomendasiTugas = " Tugas ini memiliki prioritas tingkat menengah";
            } else {
                if (prioritas <= 1.5) {
                    rekomendasiTugas = "Tugas ini relatif ringan, namun jangan tunda terlalu lama.";
                }
            }
        }
        System.out.println(namaTugas + "|" + kodeMatkul + "|" + mataKuliah + "|" + dosenPengampu + "|" + deadline + "|" + nIM + "|" + tingkatKesulitan + "|" + jumlahHari + "|" + status + "|" + rekomendasiTugas);
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
