import java.util.Scanner;

import static java.util.Collections.min;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String dvoishnoe = Integer.toBinaryString(number);
        String vosmerishmoe = Integer.toOctalString(number);
        String shesnad = Integer.toHexString(number);

        System.out.println(dvoishnoe);
        System.out.println(vosmerishmoe);
        System.out.println(shesnad);

        int min_b = Byte.MIN_VALUE;
        int max_b = Byte.MAX_VALUE;
//        System.out.println(min_b + " " + max_b);
        if (number >= min_b && number <= max_b) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        int min_s = Short.MIN_VALUE;
        int max_s = Short.MAX_VALUE;
//        System.out.println(min_s + " " + max_s);
        if (number >= min_s && number <= max_s) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }}