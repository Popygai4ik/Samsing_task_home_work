import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int kv_a = a * a;
        int kv_b = b * b;
        int kv_c = c * c;
        if ((a + b > c) && (c + b > a) && (a + c > b)) {
            if ((kv_a + kv_b == kv_c) || (kv_a + kv_c == kv_b) || (kv_c + kv_b == kv_a)) {
                System.out.println("right");
            } else if ((kv_a + kv_b < kv_c) || (kv_a + kv_c < kv_b) || (kv_a + kv_b < kv_a)) {
                System.out.println("obtuse");
            } else {
                System.out.println("acute");
            }
        } else {
            System.out.println("impossible");
        }


    }
}
