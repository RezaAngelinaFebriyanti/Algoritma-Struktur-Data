import java.util.Scanner;

public class T_ppt {
    public static void main(String[] args) {
        for (int i = 1; i <= 15; i++) {
            if (i != 6 && i != 10) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                } else {
                    System.out.print("* ");
                }
            }
        }
    }
}
