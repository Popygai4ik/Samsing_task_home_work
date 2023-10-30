import java.util.Scanner;

import static java.util.Collections.min;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int size = 2 * n + 1;

        int[][] array = new int[size][size];

        int itog_znash = (size)*(size) - 1;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < size-i; j++) {
                array[j][2*n-i] = itog_znash;
                itog_znash--;
            }
            for (int j = i; j < 2*n-i; j++) {
                array[2*n-i][2*n-1-j] = itog_znash;
                itog_znash--;
            }
            for (int j = i; j < 2*n-i; j++) {
                array[2*n-1-j][i] = itog_znash;
                itog_znash--;
            }
            for (int j = i; j < 2*n-i-1; j++) {
                array[i][j+1] = itog_znash;
                itog_znash--;
            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.printf(" %2d", array[i][j]);
            }
            System.out.println();
        }
    }

}