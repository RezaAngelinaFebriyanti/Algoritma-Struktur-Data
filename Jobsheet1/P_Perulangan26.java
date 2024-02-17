import java.util.Scanner;

public class P_Perulangan26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan NIM: ");
        long nim = in.nextLong();
        System.out.println("==========================");

        long digit = nim % 100;

        if (digit<10) {
            digit += 10;
            System.out.print("n: " + digit);
        }

        System.out.println();
        for (long i = 1 ; i <= digit ; i++) {
            if (i != 6 &&i != 10) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                } else {
                    System.out.print("* ");
                }
            }
        }
    }
}
