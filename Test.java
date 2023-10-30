import java.util.Scanner;

import static java.util.Collections.min;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        long n = scanner.nextLong();
        double result = vozvedeni_v_stepen(a, n);
        System.out.println(result);
    }

    public static double vozvedeni_v_stepen(double a, long n) {
        if (n == 0) {
            return 1.0;
        }
        if (n % 2 == 0) {
            double v = vozvedeni_v_stepen(a, n / 2);
            return v * v;
        } else {
            return a * vozvedeni_v_stepen(a, n - 1);
        }
}}