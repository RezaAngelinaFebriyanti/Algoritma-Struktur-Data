import java.util.Scanner;

public class P_Pemilihan26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float nt=0, nk=0, nts=0, nas=0;
        String nhAkhir="";
        String nht="", nhk="", nhts="", nhas="";

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");
        System.out.print("Masukkan Nilai Tugas: ");
        nt = in.nextFloat();
        System.out.print("Masukkan Nilai Kuis : ");
        nk = in.nextFloat();
        System.out.print("Masukkan Nilai UTS  : ");
        nts = in.nextFloat();
        System.out.print("Masukkan Nilai UAS  : ");
        nas = in.nextFloat();

        if ((nt<0 || nt>100) || (nk<0 || nk>100) || (nts<0 || nts>100) || (nas<0 || nas>100)) {
            System.out.println("==============================");
            System.out.println("==============================");
            System.out.println("Nilai tidak valid");
            System.out.println("==============================");
            System.out.println("==============================");
            return;
        }

        float nAkhir = 0.3f*nt + 0.3f*nk + 0.2f*nts + 0.2f*nas;
        System.out.println("==============================");
        System.out.println("==============================");
        System.out.println("Nilai Akhir: " + nAkhir);

        if (nAkhir > 80 && nAkhir <= 100) {
            nhAkhir = "A";
            System.out.println("Nilai Huruf: " + nhAkhir);
            System.out.println("==============================");
            System.out.println("==============================");
            System.out.println("SELAMAT ANDA LULUS");
        }
        else if (nAkhir > 73 && nAkhir <= 80) {
            nhAkhir = "B+";
            System.out.println("Nilai Huruf: " + nhAkhir);
            System.out.println("==============================");
            System.out.println("==============================");
            System.out.println("SELAMAT ANDA LULUS");
        }
        else if (nAkhir > 65 && nAkhir <= 73) {
            nhAkhir = "B";
            System.out.println("Nilai Huruf: " + nhAkhir);
            System.out.println("==============================");
            System.out.println("==============================");
            System.out.println("SELAMAT ANDA LULUS");
        }
        else if (nAkhir > 60 && nAkhir <= 65) {
            nhAkhir = "C+";
            System.out.println("Nilai Huruf: " + nhAkhir);
            System.out.println("==============================");
            System.out.println("==============================");
            System.out.println("SELAMAT ANDA LULUS");
        }
        else if (nAkhir > 50 && nAkhir <= 60) {
            nhAkhir = "D";
            System.out.println("Nilai Huruf: " + nhAkhir);
            System.out.println("==============================");
            System.out.println("==============================");
            System.out.println("ANDA TIDAK LULUS");
        }
        else if (nAkhir < 39) {
            nhAkhir = "E";
            System.out.println("Nilai Huruf: " + nhAkhir);
            System.out.println("==============================");
            System.out.println("==============================");
            System.out.println("ANDA TIDAK LULUS");
        }
    }
}
