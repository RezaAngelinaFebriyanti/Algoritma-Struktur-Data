import java.util.Scanner;

public class hmm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sksAgama = 2, sksBhsIng = 2, sksCtps = 2, sksPdaspro = 3, sksPamb = 2, sksDaspro = 2, sksMatdas = 2, sksKti = 2, sksBhsInd = 2;

        System.out.println("PERHITUNGAN IP MAHASISWA");
        System.out.println("========================");

        System.out.print("Nilai AGAMA    :");
        float agama = input.nextFloat();
        System.out.print("Nilai BHS ING  :");
        float bhsIng = input.nextFloat();
        // Tambahkan input untuk mata kuliah lainnya sesuai kebutuhan Anda

        String[] nhValues = {"A", "B+", "B", "C+", "C", "D", "E"};
        float[] nsValues = {4, 3.5f, 3, 2.5f, 2, 1, 0};

        // Cari nilai NH dan NS untuk mata kuliah Agama
        String nhAgama = "";
        float nsAgama = 0;
        for (int i = 0; i < nhValues.length; i++) {
            if (agama > (i * 10) && agama <= ((i + 1) * 10)) {
                nhAgama = nhValues[i];
                nsAgama = nsValues[i];
                break;
            }
        }

        // Cari nilai NH dan NS untuk mata kuliah Bahasa Inggris
        String nhBhsIng = "";
        float nsBhsIng = 0;
        for (int i = 0; i < nhValues.length; i++) {
            if (bhsIng > (i * 10) && bhsIng <= ((i + 1) * 10)) {
                nhBhsIng = nhValues[i];
                nsBhsIng = nsValues[i];
                break;
            }
        }

        // Tambahkan perhitungan untuk mata kuliah lainnya sesuai kebutuhan Anda

        // Menampilkan nilai NH dan NS untuk setiap mata kuliah
        System.out.println("Nilai NH dan NS untuk setiap mata kuliah:");
        System.out.println("AGAMA: NH = " + nhAgama + ", NS = " + nsAgama);
        System.out.println("BHS ING: NH = " + nhBhsIng + ", NS = " + nsBhsIng);
        // Tambahkan output untuk mata kuliah lainnya sesuai kebutuhan Anda
    }
}
