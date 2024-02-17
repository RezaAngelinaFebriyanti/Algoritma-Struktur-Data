import java.util.Scanner;

public class P_Fungsi26 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] allToko = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}
        };

        System.out.println("PENDAPATAN PER CABANG TERJUAL HABIS");
        System.out.println("===================================");
        System.out.println("===================================");
        incomeHabis(allToko);
        System.out.println("===================================");
        System.out.println();

        System.out.println("INPUT BUNGA MATI (Bil Negatif)");
        System.out.println("===================================");
        System.out.println("===================================");
        bungaMati(allToko);
        stok(allToko);
    }

    public static void incomeHabis(int[][] allToko) {
        for (int i = 0; i < allToko.length; i++) {
            double totalPendapatan = hitungTotalPendapatan(allToko[i]);
            System.out.printf("RoyalGarden %d: Rp. %,.2f%n", i+1, totalPendapatan);
        }
    }

    public static double hitungTotalPendapatan(int[] allToko) {
        int aglonema = 75000, keladi = 50000, alocasia = 60000, mawar = 10000, income = 0;
        income = aglonema * allToko[0] + keladi * allToko[1] + alocasia * allToko[2] + mawar * allToko[3];
        return income;
    }

    public static void bungaMati(int[][] allToko) {
        System.out.print("Pilih cabang toko (1-4): ");
        int cabang = in.nextInt();

        int aglo = 0, kel = 0, alo = 0, maw = 0;

        switch (cabang) {
            case 1:
                System.out.print("Aglonema: ");
                aglo = in.nextInt();
                System.out.print("Keladi  : ");
                kel = in.nextInt();
                System.out.print("Alocasia: ");
                alo = in.nextInt();
                System.out.print("Mawar   : ");
                maw = in.nextInt();
                System.out.println("===================================");
                System.out.println();
                System.out.println("SISA STOK BUNGA");
                System.out.println("===================================");
                System.out.println("===================================");
                break;
            case 2:
                System.out.print("Aglonema: ");
                aglo = in.nextInt();
                System.out.print("Keladi  : ");
                kel = in.nextInt();
                System.out.print("Alocasia: ");
                alo = in.nextInt();
                System.out.print("Mawar   : ");
                maw = in.nextInt();
                System.out.println("===================================");
                System.out.println();
                System.out.println("SISA STOK BUNGA");
                System.out.println("===================================");
                System.out.println("===================================");
                break;
            case 3:
                System.out.print("Aglonema: ");
                aglo = in.nextInt();
                System.out.print("Keladi  : ");
                kel = in.nextInt();
                System.out.print("Alocasia: ");
                alo = in.nextInt();
                System.out.print("Mawar   : ");
                maw = in.nextInt();
                System.out.println("===================================");
                System.out.println();
                System.out.println("SISA STOK BUNGA");
                System.out.println("===================================");
                System.out.println("===================================");
                break;
            case 4:
                System.out.print("Aglonema: ");
                aglo = in.nextInt();
                System.out.print("Keladi  : ");
                kel = in.nextInt();
                System.out.print("Alocasia: ");
                alo = in.nextInt();
                System.out.print("Mawar   : ");
                maw = in.nextInt();
                System.out.println("===================================");
                System.out.println();
                System.out.println("SISA STOK BUNGA");
                System.out.println("===================================");
                System.out.println("===================================");
                break;
        }
        
        int[][] bungaMati = {{aglo, kel, alo, maw}};
        for (int i = 0; i < allToko.length; i++) {
            for (int j = 0; j < bungaMati[0].length; j++) {
                allToko[i][j] += bungaMati[0][j];
            }
        }
    }

    public static void stok(int[][] allToko) {
        for (int i = 0; i < allToko.length; i++) {
            System.out.printf("RoyalGarden %d: ", i+1);
            for (int j = 0; j < allToko[i].length; j++) {
                System.out.printf("%d ", allToko[i][j]);
            }
            System.out.println();
        }
    }
}
