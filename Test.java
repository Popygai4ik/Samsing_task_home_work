import java.util.Scanner;

import static java.util.Collections.min;

public class Test {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[][] matrix = new int[N][M];

        int znasheni_shetshik = 0;
        int polosa = 1;

        for (int i = 0; i < N; i++) {
            if (polosa == 1) {
                for (int j = 0; j < M; j++) {
                    matrix[i][j] = znasheni_shetshik;
                    znasheni_shetshik++;
                }
                polosa = -1;
            } else {
                for (int j = M - 1; j >= 0; j--) {
                    matrix[i][j] = znasheni_shetshik;
                    znasheni_shetshik++;
                }
                polosa = 1;
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.printf("%3d", matrix[i][j]);
            }
            System.out.println();
        }
    }

}