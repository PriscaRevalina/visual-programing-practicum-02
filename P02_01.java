// 12S23039-Prisca Manurung
import java.util.*;
import java.lang.Math;

class P02-01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String namaTugas, kodeMatkul, mataKuliah, dosenPengampu, deadline, nIMNamaMatkul, status, rekomendasiTugas;
        int tingkatKesulitan, hari;
        double prioritas;

        namaTugas = input.nextLine();
        kodeMatkul = input.nextLine();
        mataKuliah = input.nextLine();
        dosenPengampu = input.nextLine();
        deadline = input.nextLine();
        nIMNamaMatkul = input.nextLine();
        status = input.nextLine();
        tingkatKesulitan = input.nextInt();
        rekomendasiTugas = input.nextLine();
        hari = input.nextInt();
        prioritas = Tingkat * (1.0 / hari);
        System.out.println("Prioritas: " + toFixed(prioritas,2));
        if (prioritas > 3) {
            Hasil1 = "Penting! Anda harus mengerjakan tugas ini segera";
        } else {
            if (prioritas >= 1.5 && prioritas <= 3) {
                Hasil1 = " Tugas ini memiliki prioritas tingkat menengah";
            } else {
                if (prioritas <= 1.5) {
                    Hasil1 = "Tugas ini relatif ringan, namun jangan tunda terlalu lama.";
                }
            }
        }
        System.out.println(Nama + " | " + Kode + " | " + mataKuliah + " | " + Dosen + " | " + deadline + " | " + NIM + " | " + Tingkat + " | " + hari + " | " + status);
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
