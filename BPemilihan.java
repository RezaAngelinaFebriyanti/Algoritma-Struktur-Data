import java.util.Scanner;

public class BPemilihan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float nt=0, nk=0, nts=0, nas=0;
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
        
        if (nt > 80 && nt <= 100) {
        nht = "A";
        System.out.println("Nilai Huruf: " + nht);
        System.out.println("==============================");
        System.out.println("==============================");
        System.out.println("SELAMAT ANDA LULUS");
        }
        else if (nt > 73 && nt <= 80) {
        nht = "B+";
        System.out.println("Nilai Huruf: " + nht);
        System.out.println("==============================");
        System.out.println("==============================");
        System.out.println("SELAMAT ANDA LULUS");
        }
        else if (nt > 65 && nt <= 73) {
        nht = "B";
        System.out.println("Nilai Huruf: " + nht);
        System.out.println("==============================");
        System.out.println("==============================");
        System.out.println("SELAMAT ANDA LULUS");
        }
        else if (nt > 60 && nt <= 65) {
        nht = "C+";
        System.out.println("Nilai Huruf: " + nht);
        System.out.println("==============================");
        System.out.println("==============================");
        System.out.println("SELAMAT ANDA LULUS");
        }
        else if (nt > 50 && nt <= 60) {
        nht = "C";
        System.out.println("Nilai Huruf: " + nht);
        System.out.println("==============================");
        System.out.println("==============================");
        System.out.println("SELAMAT ANDA LULUS");
        }
        else if (nt > 39 && nt <= 50) {
        nht = "D";
        System.out.println("Nilai Huruf: " + nht);
        System.out.println("==============================");
        System.out.println("==============================");
        System.out.println("ANDA TIDAK LULUS");
        }
        else if (nt < 39) {
        nht = "E";
        System.out.println("Nilai Huruf: " + nht);
        System.out.println("==============================");
        System.out.println("==============================");
        System.out.println("ANDA TIDAK LULUS");
        }

        if (nk > 80 && nk <= 100) {
        nhk = "A";
        System.out.println("Nilai Huruf: " + nhk);
        System.out.println("==============================");
        System.out.println("==============================");
        System.out.println("SELAMAT ANDA LULUS");
        }
        else if (nk > 73 && nk <= 80) {
        nhk = "B+";
        System.out.println("Nilai Huruf: " + nhk);
        System.out.println("==============================");
        System.out.println("==============================");
        System.out.println("SELAMAT ANDA LULUS");
        }
        else if (nk > 65 && nk <= 73) {
        nhk = "B";
        System.out.println("Nilai Huruf: " + nhk);
        System.out.println("==============================");
        System.out.println("==============================");
        System.out.println("SELAMAT ANDA LULUS");
        }
        else if (nk > 60 && nk <= 65) {
        nhk = "C+";
        System.out.println("Nilai Huruf: " + nhk);
        System.out.println("==============================");
        System.out.println("==============================");
        System.out.println("SELAMAT ANDA LULUS");
        }
        else if (nk > 50 && nk <= 60) {
        nhk = "C";
        System.out.println("Nilai Huruf: " + nhk);
        System.out.println("==============================");
        System.out.println("==============================");
        System.out.println("SELAMAT ANDA LULUS");
        }
        else if (nk > 39 && nk <= 50) {
        nhk = "D";
        System.out.println("Nilai Huruf: " + nhk);
        System.out.println("==============================");
        System.out.println("==============================");
        System.out.println("ANDA TIDAK LULUS");
        }
        else if (nk < 39) {
        nhk = "E";
        System.out.println("Nilai Huruf: " + nhk);
        System.out.println("==============================");
        System.out.println("==============================");
        System.out.println("ANDA TIDAK LULUS");
        }

        if (nts > 80 && nts <= 100) {
        nhts= "A";
        System.out.println("Nilai Huruf: " + nhts);
        System.out.println("==============================");
        System.out.println("==============================");
        System.out.println("SELAMAT ANDA LULUS");
        }
        else if (nts > 73 && nts<= 80) {
        nhts= "B+";
        System.out.println("Nilai Huruf: " + nhts);
        System.out.println("==============================");
        System.out.println("==============================");
        System.out.println("SELAMAT ANDA LULUS");
        }
        else if (nts > 65 && nts <= 73) {
        nhts= "B";
        System.out.println("Nilai Huruf: " + nhts);
        System.out.println("==============================");
        System.out.println("==============================");
        System.out.println("SELAMAT ANDA LULUS");
        }
        else if (nts > 60 && nts <= 65) {
        nhts= "C+";
        System.out.println("Nilai Huruf: " + nhts);
        System.out.println("==============================");
        System.out.println("==============================");
        System.out.println("SELAMAT ANDA LULUS");
        }
        else if (nts > 50 && nts <= 60) {
        nhts= "C";
        System.out.println("Nilai Huruf: " + nhts);
        System.out.println("==============================");
        System.out.println("==============================");
        System.out.println("SELAMAT ANDA LULUS");
        }
        else if (nts > 39 && nts <= 50) {
        nhts= "D";
        System.out.println("Nilai Huruf: " + nhts);
        System.out.println("==============================");
        System.out.println("==============================");
        System.out.println("ANDA TIDAK LULUS");
        }
        else if (nts < 39) {
        nhts= "E";
        System.out.println("Nilai Huruf: " + nhts);
        System.out.println("==============================");
        System.out.println("==============================");
        System.out.println("ANDA TIDAK LULUS");
        }

        if (nas > 80 && nas <= 100) {
        nhas = "A";
        System.out.println("Nilai Huruf: " + nhas);
        System.out.println("==============================");
        System.out.println("==============================");
        System.out.println("SELAMAT ANDA LULUS");
        }
        else if (nas > 73 && nas <= 80) {
        nhas = "B+";
        System.out.println("Nilai Huruf: " + nhas);
        System.out.println("==============================");
        System.out.println("==============================");
        System.out.println("SELAMAT ANDA LULUS");
        }
        else if (nas > 65 && nas <= 73) {
        nhas = "B";
        System.out.println("Nilai Huruf: " + nhas);
        System.out.println("==============================");
        System.out.println("==============================");
        System.out.println("SELAMAT ANDA LULUS");
        }
        else if (nas > 60 && nas <= 65) {
        nhas = "C+";
        System.out.println("Nilai Huruf: " + nhas);
        System.out.println("==============================");
        System.out.println("==============================");
        System.out.println("SELAMAT ANDA LULUS");
        }
        else if (nas > 50 && nas <= 60) {
        nhas = "C";
        System.out.println("Nilai Huruf: " + nhas);
        System.out.println("==============================");
        System.out.println("==============================");
        System.out.println("SELAMAT ANDA LULUS");
        }
        else if (nas > 39 && nas <= 50) {
        nhas = "D";
        System.out.println("Nilai Huruf: " + nhas);
        System.out.println("==============================");
        System.out.println("==============================");
        System.out.println("ANDA TIDAK LULUS");
        }
        else if (nas < 39) {
        nhas = "E";
        System.out.println("Nilai Huruf: " + nhas);
        System.out.println("==============================");
        System.out.println("==============================");
        System.out.println("ANDA TIDAK LULUS");
        }
    }
}
