import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

import static java.util.Collections.min;

public class Test {

    public static void main(String[] args) {
        int[] sp = {200, -5555, 4852, -5555, 15, 78, 65};
//        Scanner scanner = new Scanner(System.in);
//        ArrayList<Integer> sp = new ArrayList<>();
//        int p = 0;
//        float n = scanner.nextFloat();
//        int n2 = scanner.nextInt();
//        System.out.println(NumberDigits.sumOfSeven(n, n2));
//        int n = scanner.nextInt();
//        System.out.println(NumberDigits.sumOfThirteen(n));
////        System.out.println(NumberDigits.binFraction(n, n2));
//        int n = scanner.nextInt();
//        for (int i = 0; i < n; i++) {
//            p = scanner.nextInt();
//            sp.add(p);
//        }
//        System.out.printf(MyArrays.avgOf4Digit(sp));
        System.out.println(MyArrays.minToBegin(sp));
        }

    }

