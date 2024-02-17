import java.util.Scanner;

public class uji {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);

        int sksAgama = 2, sksBhsIng = 2;

        System.out.print("Nilai AGAMA    :");
        float agama = i.nextFloat();
        System.out.print("Nilai BHS ING  :");
        float bhsIng = i.nextFloat();

        if (agama > 80 && agama <= 100) {
            String nhAgama = "A";
            float nsAgama = 4;
            float iA = nsAgama * sksAgama;
        }
        if (agama > 73 && agama <= 80) {
            String nhAgama = "B+";
            float nsAgama = 3.5f;
            float iA = nsAgama * sksAgama;
        }
        if (agama > 65 && agama <= 73) {
            String nhAgama = "B";
            float nsAgama = 3;
            float iA = nsAgama * sksAgama;
        }
        else if (agama > 60 && agama <= 65) {
            String nhAgama = "C+";
            float nsAgama = 2.5f;
            float iA = nsAgama * sksAgama;
        }
        else if (agama > 50 && agama <= 60) {
            String nhAgama = "C";
            float nsAgama = 2;
            float iA = nsAgama * sksAgama;
        }
        else if (agama > 39 && agama <= 50) {
            String nhAgama = "D";
            float nsAgama = 1;
            float iA = nsAgama * sksAgama;
        }
        else if (agama < 39) {
            String nhAgama = "E";
            float nsAgama = 0;
            float iA = nsAgama * sksAgama;
        }

        if (bhsIng > 80 && bhsIng <= 100) {
            String nhIng = "A";
            float nsBhsIng = 4;
            float iIng = nsBhsIng * sksBhsIng;
        }
        if (bhsIng > 73 && bhsIng <= 80) {
            String nhIng = "B+";
            float nsBhsIng = 3.5f;
            float iIng = nsBhsIng * sksBhsIng;
        }
        if (bhsIng > 65 && bhsIng <= 73) {
            float nsBhsIng = 3;
            float iIng = nsBhsIng * sksBhsIng;
        }
        if (bhsIng > 60 && bhsIng <= 65) {
            float nsBhsIng = 2.5f;
            float iIng = nsBhsIng * sksBhsIng;
        }
        if (bhsIng > 50 && bhsIng <= 60) {
            float nsBhsIng = 2;
            float iIng = nsBhsIng * sksBhsIng;
        }
        if (bhsIng > 39 && bhsIng <= 50) {
            float nsBhsIng = 1;
            float iIng = nsBhsIng * sksBhsIng;
        }
        if (bhsIng < 39) {
            float nsBhsIng = 0;
            float iIng = nsBhsIng * sksBhsIng;
        }

        
    }
}
