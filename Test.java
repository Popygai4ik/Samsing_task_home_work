import java.util.Scanner;

import static java.util.Collections.min;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[][] matrix_do = new int[N][M];

        // Чтение матрицы
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matrix_do[i][j] = scanner.nextInt();
            }
        }

        int[][] matrix_posle = new int[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                matrix_posle[i][j] = matrix_do[N - j - 1][i];
            }
        }

        System.out.println(M + " " + N);
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matrix_posle[i][j] + " ");
            }
            System.out.println();
        }

    }}

