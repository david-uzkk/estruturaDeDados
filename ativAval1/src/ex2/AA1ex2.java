package ex2;

import java.util.Scanner;
import java.util.Random;

public class AA1ex2 {
    public static void main(String[] args) {
        int n = 0;
        int[] r = new int[10];

        Random random = new Random();

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite um numero: ");
            n = sc.nextInt();
        }

        for (int i = 1; i < 8; i++) {
            r[i] = random.nextInt(n);
        }

        for (int i = 1; i < 8; i++) {
            System.out.printf("%d  ", r[i]);
        }
    }
}
