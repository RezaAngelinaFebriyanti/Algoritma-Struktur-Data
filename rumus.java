import java.util.Scanner;

public class rumus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("1. Kecepatan");
        System.out.println("2. Jarak");
        System.out.println("3. Waktu");
        System.out.print("PILIH RUMUS (1-3): ");
        int rumus = in.nextInt();

        switch (rumus) {
            case 1:
                hKecepatan();
                break;
            case 2:
                hJarak();
                break;
            case 3:
                hWaktu();
                break;
            default:
                System.out.println("Pilihan tidak valid");
        }
    }

    public static void hKecepatan() {
        Scanner in = new Scanner(System.in);

        System.out.println("=======================");
        System.out.print("Masukkan jarak (meter): ");
        double j = in.nextDouble();
        System.out.print("Masukkan waktu (detik): ");
        double w = in.nextDouble();
        double k = j / w;
        System.out.println("Jadi kecepatan: " + k + " meter/detik");
    }

    public static void hJarak() {
        Scanner in = new Scanner(System.in);

        System.out.println("=======================");
        System.out.print("Masukkan kecepatan (meter/detik): ");
        double k = in.nextDouble();
        System.out.print("Masukkan waktu (detik): ");
        double w = in.nextDouble();
        double j = k * w;
        System.out.println("Jadi jarak: " + j + " meter");
    }

    public static void hWaktu() {
        Scanner in = new Scanner(System.in);

        System.out.println("=======================");
        System.out.print("Masukkan kecepatan (meter/detik): ");
        double k = in.nextDouble();
        System.out.print("Masukkan jarak (meter): ");
        double j = in.nextDouble();
        double w = j / k;
        System.out.println("Jadi waktu: " + w + " detik");
    }
}
