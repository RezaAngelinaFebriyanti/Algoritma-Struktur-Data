public class T_ppt2 {
    public static void main(String[] args) {
        int[][] data = {
                {4, 1, 1},
                {3, 1, 2},
                {4, 2, 3},
                {4, 3, 4}
        };

        // Memanggil fungsi untuk menghitung rata-rata setiap baris
        double[] rata = hitungMean(data);

        // Mencetak rata-rata setiap baris
        for (int i = 0; i < rata.length; i++) {
            System.out.println("Film ke-" + (i+1) + ": " + rata[i]);
        }

        // Menampilkan film dengan rata-rata tertinggi
        int filmMax = filmRataMax(rata);
        System.out.println("Film dengan rata-rata tertinggi adalah film ke-" + (filmMax + 1));

        // Menampilkan film dengan rata-rata terendah
        int filmMin = filmRataMin(rata);
        System.out.println("Film dengan rata-rata terendah adalah film ke-" + (filmMin + 1));
    }

    // Fungsi untuk menghitung rata-rata setiap baris dalam array dua dimensi
    public static double[] hitungMean(int[][] data) {
        double[] rata = new double[data.length];
        for (int i = 0; i < data.length; i++) {
            int sum = 0;
            for (int j = 0; j < data[i].length; j++) {
                sum += data[i][j];
            }
            rata[i] = (double) sum / data[i].length;
        }
        return rata;
    }

    // Fungsi untuk menemukan indeks film dengan rata-rata tertinggi
    public static int filmRataMax(double[] rata) {
        double max = rata[0];
        int index = 0;
        for (int i = 1; i < rata.length; i++) {
            if (rata[i] > max) {
                max = rata[i];
                index = i;
            }
        }
        return index;
    }

    // Fungsi untuk menemukan indeks film dengan rata-rata terendah
    public static int filmRataMin(double[] rata) {
        double min = rata[0];
        int index = 0;
        for (int i = 1; i < rata.length; i++) {
            if (rata[i] < min) {
                min = rata[i];
                index = i;
            }
        }
        return index;
    }
}
