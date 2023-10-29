import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

import static java.util.Collections.min;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float n = scanner.nextFloat();
        int n2 = scanner.nextInt();
//        System.out.println(NumberDigits.sumOfSeven(n, n2));
//        int n = scanner.nextInt();
//        System.out.println(NumberDigits.sumOfThirteen(n));
        System.out.println(NumberDigits.binFraction(n, n2));
        }

    }

