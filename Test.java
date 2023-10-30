import java.util.Scanner;

import static java.util.Collections.min;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int result = 0;
        int shetshik = 0;
        while (shetshik != Math.abs(B)) {
            result = result + Math.abs(A);
            shetshik++;
        }
        if (B < 0 && A > 0) {
            result = -result;
        } else if (B > 0 && A < 0){
            result = -result;
        }
        System.out.println(result);
}}