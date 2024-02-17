import java.util.Scanner;

public class P_Array26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] matkul ={"AGAMA", "BHS ING", "CTPS", "P. DASPRO", "PAMB", "DASPRO", "MATDAS", "KTI", "BHS IND"};

        System.out.println("======================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("======================");

        double nilaiMK[] = new double[9];
        for (int i = 0; i < matkul.length; i++) {
            System.out.print("Masukkan nilai angka untuk MK " + matkul[i] + ": ");
            nilaiMK[i] = in.nextInt();
        }

        System.out.println("======================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("======================");
        System.out.println("MK\t\t\t\t             Nilai Angka     Nilai Huruf     Bobot Nilai");

        double nilaiAngka = 0;
        String nilaiHuruf = "";
        double ns[] = {4, 3.5, 3, 2.5, 2, 1, 0};
        double[] sks = {2,2,2,3,2,2,2,2,2};
        double ip = 0;
        String hasilNS = "";


        for (int i = 0; i < matkul.length; i++) {
            if (nilaiMK[i] > 80  && nilaiMK[i] <= 100) {
                nilaiAngka = nilaiMK[i];
                nilaiHuruf = "A";
                for (int j = 0; j < 1; j++) {
                    hasilNS = String.format("%.2f", ns[j]);
                }
                ip += ns[0] * sks[i];
            } else if (nilaiMK[i] > 73 && nilaiMK[i] <= 80) {
                nilaiAngka = nilaiMK[i];
                nilaiHuruf = "B+";
                for (int j = 1; j < 2; j++) {
                    hasilNS = String.format("%.2f", ns[j]);
                }
                ip += ns[1] * sks[i];
            } else if (nilaiMK[i] > 65 && nilaiMK[i] <= 73) {
                nilaiAngka = nilaiMK[i];
                nilaiHuruf = "B";
                for (int j = 2; j < 3; j++) {
                    hasilNS = String.format("%.2f", ns[j]);
                }
                ip += ns[2] * sks[i];
            } else if (nilaiMK[i] > 60 && nilaiMK[i] <= 65) {
                nilaiAngka = nilaiMK[i];
                nilaiHuruf = "C+";
                for (int j = 3; j < 4; j++) {
                    hasilNS = String.format("%.2f", ns[j]);
                }
                ip += ns[3] * sks[i];
            } else if (nilaiMK[i] > 50 && nilaiMK[i] <= 60) {
                nilaiAngka = nilaiMK[i];
                nilaiHuruf = "C";
                for (int j = 4; j < 5; j++) {
                    hasilNS = String.format("%.2f", ns[j]);
                }
                ip += ns[4] * sks[i];
            } else if (nilaiMK[i] > 39 && nilaiMK[i] <= 50) {
                nilaiAngka = nilaiMK[i];
                nilaiHuruf = "D";
                for (int j = 5; j < 6; j++) {
                    hasilNS = String.format("%.2f", ns[j]);
                }
                ip += ns[5] * sks[i];
            } else if (nilaiMK[i] <= 39) {
                nilaiAngka = nilaiMK[i];
                nilaiHuruf = "E";
                for (int j = 6; j < 7; j++) {
                    hasilNS = String.format("%.2f", ns[j]);
                }
                ip += ns[6] * sks[i];
            }
            System.out.printf("%-45s%-18.2f%-15s%-16s\n", matkul[i], nilaiAngka, nilaiHuruf, hasilNS);
        }

        double ipk = ip / 19;
        System.out.println("======================");
        System.out.println("IP : "+ ipk);
    }
}