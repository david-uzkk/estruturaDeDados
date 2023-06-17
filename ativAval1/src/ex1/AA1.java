import java.util.Scanner;

public class AA1 {

    public static void main(String[] args) {
        int[] M = new int[10];
        try (Scanner sc = new Scanner(System.in)) {
            for (int i = 1; i < 5; i++) {
                System.out.print("Digite um numero: ");
                M[i] = sc.nextInt();

            }
        }

        System.out.print("\n");

        for (int i = 1; i < 5; i++) {
            System.out.printf("%d  ", M[i]);
        }

        System.out.print("\n");

        for (int i = 4; i > 0; i--) {
            System.out.printf("%d  ", M[i]);
        }
    }
}
