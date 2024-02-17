import java.util.Scanner;

public class P_Array2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sksAgama = 2, sksBhsIng = 2, sksCtps = 2, sksPdaspro = 3, sksPamb = 2, sksDaspro = 2, sksMatdas = 2, sksKti = 2, sksBhsInd = 2;

        System.out.println("PERHITUNGAN IP MAHASISWA");
        System.out.println("========================");

        System.out.print("Nilai AGAMA    :");
        float agama = input.nextFloat();
        System.out.print("Nilai BHS ING  :");
        float bhsIng = input.nextFloat();
        System.out.print("Nilai CTPS     :");
        float ctps = input.nextFloat();
        System.out.print("Nilai P. DASPRO:");
        float pDaspro = input.nextFloat();
        System.out.print("Nilai PAMB     :");
        float pamb = input.nextFloat();
        System.out.print("Nilai DASPRO   :");
        float daspro = input.nextFloat();
        System.out.print("Nilai MATDAS   :");
        float matdas = input.nextFloat();
        System.out.print("Nilai KTI      :");
        float kti = input.nextFloat();
        System.out.print("Nilai BHS IND  :");
        float bhsInd = input.nextFloat();

        float iA = 0, iIng = 0, iCt = 0, iPd = 0, iPa = 0, iDas = 0, iMat = 0, iK = 0, iBi = 0;
        String nhAgama = "", nhIng = "", nCtps = "", nPd = "", nPa = "", nDas = "", nMat = "", nK = "", nBi = "";

        if (agama > 80 && agama <= 100) {
            nhAgama = "A";
            float nsAgama = 4;
            iA = nsAgama * sksAgama;
        }
        else if (agama > 73 && agama <= 80) {
            nhAgama = "B+";
            float nsAgama = 3.5f;
            iA = nsAgama * sksAgama;
        }
        else if (agama > 65 && agama <= 73) {
            nhAgama = "B";
            float nsAgama = 3;
            iA = nsAgama * sksAgama;
        }
        else if (agama > 60 && agama <= 65) {
            nhAgama = "C+";
            float nsAgama = 2.5f;
            iA = nsAgama * sksAgama;
        }
        else if (agama > 50 && agama <= 60) {
            nhAgama = "C";
            float nsAgama = 2;
            iA = nsAgama * sksAgama;
        }
        else if (agama > 39 && agama <= 50) {
            nhAgama = "D";
            float nsAgama = 1;
            iA = nsAgama * sksAgama;
        }
        else if (agama < 39) {
            nhAgama = "E";
            float nsAgama = 0;
            iA = nsAgama * sksAgama;
        }
        
        if (bhsIng > 80 && bhsIng <= 100) {
            nhIng = "A";
            float nsBhsIng = 4;
            iIng = nsBhsIng * sksBhsIng;
        }
        else if (bhsIng > 73 && bhsIng <= 80) {
            nhIng = "B+";
            float nsBhsIng = 3.5f;
            iIng = nsBhsIng * sksBhsIng;
        }
        else if (bhsIng > 65 && bhsIng <= 73) {
            nhIng = "B";
            float nsBhsIng = 3;
            iIng = nsBhsIng * sksBhsIng;
        }
        else if (bhsIng > 60 && bhsIng <= 65) {
            nhIng = "C+";
            float nsBhsIng = 2.5f;
            iIng = nsBhsIng * sksBhsIng;
        }
        else if (bhsIng > 50 && bhsIng <= 60) {
            nhIng = "C";
            float nsBhsIng = 2;
            iIng = nsBhsIng * sksBhsIng;
        }
        else if (bhsIng > 39 && bhsIng <= 50) {
            nhIng = "D";
            float nsBhsIng = 1;
            iIng = nsBhsIng * sksBhsIng;
        }
        else if (bhsIng < 39) {
            nhIng = "E";
            float nsBhsIng = 2;
            iIng = nsBhsIng * sksBhsIng;
        }

        if (ctps > 80 && ctps <= 100) {
            nCtps = "A";
            float nsCtps = 4;
            iCt = nsCtps * sksCtps; 
        }
        else if (ctps > 73 && ctps <= 80) {
            nCtps = "B+";
            float nsCtps = 3.5f;
            iCt = nsCtps * sksCtps;
        }
        else if (ctps > 65 && ctps <= 73) {
            nCtps = "B";
            float nsCtps = 3;
            iCt = nsCtps * sksCtps;
        }
        else if (ctps > 60 && ctps <= 65) {
            nCtps = "C+";
            float nsCtps = 2.5f;
            iCt = nsCtps * sksCtps;
        }
        else if (ctps > 50 && ctps <= 60) {
            nCtps = "C";
            float nsCtps = 2;
            iCt = nsCtps * sksCtps;
        }
        else if (ctps > 39 && ctps <= 50) {
            nCtps = "D";
            float nsCtps = 1;
            iCt = nsCtps * sksCtps;
        }
        else if (ctps < 39) {
            nCtps = "E";
            float nsCtps = 0;
            iCt = nsCtps * sksCtps;
        }

        if (pDaspro > 80 && pDaspro <= 100) {
            nPd = "A";
            float nsPd = 4;
            iPd = nsPd * sksPdaspro;
        }
        else if (pDaspro > 73 && pDaspro <= 80) {
            nPd = "B+";
            float nsPd = 3.5f;
            iPd = nsPd * sksPdaspro;
        }
        else if (pDaspro > 65 && pDaspro <= 73) {
            nPd = "B";
            float nsPd = 3;
            iPd = nsPd * sksPdaspro;
        }
        else if (pDaspro > 60 && pDaspro <= 65) {
            nPd = "C+";
            float nsPd = 2.5f;
            iPd = nsPd * sksPdaspro; 
        }
        else if (pDaspro > 50 && pDaspro <= 60) {
            nPd = "C";
            float nsPd = 2;
            iPd = nsPd * sksPdaspro;
        }
        else if (pDaspro > 39 && pDaspro <= 50) {
            nPd = "D";
            float nsPd = 1;
            iPd = nsPd * sksPdaspro;
        }
        else if (pDaspro < 39) {
            nPd = "E";
            float nsPd = 0;
            iPd = nsPd * sksPdaspro;
        }

        if (pamb > 80 && pamb <= 100) {
            nPa = "A";
            float nsPa = 4;
            iPa = nsPa * sksPamb;
        }
        else if (pamb > 73 && pamb <= 80) {
            nPa = "B+";
            float nsPa = 3.5f;
            iPa = nsPa * sksPamb;
        }
        else if (pamb > 65 && pamb <= 73) {
            nPa = "B";
            float nsPa = 3;
            iPa = nsPa * sksPamb;
        }
        else if (pamb > 60 && pamb <= 65) {
            nPa = "C+";
            float nsPa = 2.5f;
            iPa = nsPa * sksPamb;
        }
        else if (pamb > 50 && pamb <= 60) {
            nPa = "C";
            float nsPa = 2;
            iPa = nsPa * sksPamb;
        }
        else if (pamb > 39 && pamb <= 50) {
            nPa = "D";
            float nsPa = 1;
            iPa = nsPa * sksPamb;
        }
        else if (pamb < 39) {
            nPa = "E";
            float nsPa = 0;
            iPa = nsPa * sksPamb;
        }

        if (daspro > 80 && daspro <= 100) {
            nDas = "A";
            float nsDas = 4;
            iDas = nsDas * sksDaspro;
        }
        else if (daspro > 73 && daspro <= 80) {
            nDas = "B+";
            float nsDas = 3.5f;
            iDas = nsDas * sksDaspro;
        }
        else if (daspro > 65 && daspro <= 73) {
            nDas = "B";
            float nsDas = 3;
            iDas = nsDas * sksDaspro;
        }
        else if (daspro > 60 && daspro <= 65) {
            nDas = "C+";
            float nsDas = 2.5f;
            iDas = nsDas * sksDaspro;
        }
        else if (daspro > 50 && daspro <= 60) {
            nDas = "C";
            float nsDas = 2;
            iDas = nsDas * sksDaspro;
        }
        else if (daspro > 39 && daspro <= 50) {
            nDas = "D";
            float nsDas = 1;
            iDas = nsDas * sksDaspro;
        }
        else if (daspro < 39) {
            nDas = "E";
            float nsDas = 0;
            iDas = nsDas * sksDaspro;
        }

        if (matdas > 80 && matdas <= 100) {
            nMat = "A";
            float nsMat = 4;
            iMat = nsMat * sksMatdas;
        }
        else if (matdas > 73 && matdas <= 80) {
            nMat = "B+";
            float nsMat = 3.5f;
            iMat = nsMat * sksMatdas;
        }
        else if (matdas > 65 && matdas <= 73) {
            nMat = "B";
            float nsMat = 3;
            iMat = nsMat * sksMatdas;
        }
        else if (matdas > 60 && matdas <= 65) {
            nMat = "C+";
            float nsMat = 2.5f;
            iMat = nsMat * sksMatdas;
        }
        else if (matdas > 50 && matdas <= 60) {
            nMat = "C";
            float nsMat = 2;
            iMat = nsMat * sksMatdas;
        }
        else if (matdas > 39 && matdas <= 50) {
            nMat = "D";
            float nsMat = 1;
            iMat = nsMat * sksMatdas;
        }
        else if (matdas < 39) {
            nMat = "E";
            float nsMat = 0;
            iMat = nsMat * sksMatdas;
        }

        if (kti > 80 && kti <= 100) {
            nK = "A";
            nsK = 4;
            iK = nsK * sksKti;
        }
        else if (kti > 73 && kti <= 80) {
            nK = "B+";
            nsK = 3.5f;
            iK = nsK * sksKti;
        }
        else if (kti > 65 && kti <= 73) {
            nK = "C";
            nsK = 3;
            iK = nsK * sksKti;
        }
        else if (kti > 60 && kti <= 65) {
            nK = "C+";
            nsK = 2.5f;
            iK = nsK * sksKti;
        }
        else if (kti > 50 && kti <= 60) {
            nK = "C";
            nsK = 2;
            iK = nsK * sksKti;
        }
        else if (kti > 39 && kti <= 50) {
            nK = "D";
            nsK = 1;
            iK = nsK * sksKti;
        }
        else if (kti < 39) {
            nK = "E";
            nsK = 0;
            iK = nsK * sksKti;
        }

        if (bhsInd> 80 && bhsInd <= 100) {
            nBi = "A";
            nsBi = 4;
            iBi = nsBi * sksBhsInd;
        }
        else if (bhsInd > 73 && bhsInd <= 80) {
            nBi = "B+";
            nsBi = 3.5f;
            iBi = nsBi * sksBhsInd;
        }
        else if (bhsInd > 65 && bhsInd <= 73) {
            nBi = "B";
            nsBi = 3;
            iBi = nsBi * sksBhsInd;
        }
        else if (bhsInd > 60 && bhsInd <= 65) {
            nBi = "C+";
            nsBi = 2.5f;
            iBi = nsBi * sksBhsInd;
        }
        else if (bhsInd > 50 && bhsInd <= 60) {
            nBi = "C";
            nsBi = 2;
            iBi = nsBi * sksBhsInd;
        }
        else if (bhsInd > 39 && bhsInd <= 50) {
            nBi = "D";
            nsBi = 1;
            iBi = nsBi * sksBhsInd;
        }
        else if (bhsInd < 39) {
            nBi = "E";
            nsBi = 0;
            iBi = nsBi * sksBhsInd;
        }

        float tSks = sksAgama + sksBhsInd + sksBhsIng + sksCtps + sksDaspro + sksKti + sksMatdas + sksPamb + sksPdaspro;
        float ip = (iA + iIng + iCt + iPd + iPa + iDas + iMat + iK + iBi) / tSks;

        System.out.println("========================");
        System.out.println("HASIL KONVERENSI NILAI");

        String[] judul = {"MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai"};
        System.out.println(judul[0] + "/t" + judul[1] + "/t" + judul[2] + "/t" + judul[3]);

        String[] mk = {"AGAMA", "BHS ING", "CTPS", "P. DASPRO", "PAMB", "DASPRO", "MATDAS", "KTI", "BHS IND"};
        float[] nA = {agama, bhsIng, ctps, pDaspro, pamb, daspro, matdas, kti, bhsInd};
        String[] nH = {nhAgama, nhIng, nCtps, nPd, nPa, nDas, nMat, nK, nBi};
        float[] bN = {nsBi};

        
        System.out.println("========================");
        System.out.print("IP : " + ip);
    }
}