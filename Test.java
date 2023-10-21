import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int kv_a = a * a;
        int kv_b = b * b;
//        System.out.println(kv_a);
//        System.out.println(kv_b);
        int sum_a_b = kv_a + kv_b;
//        System.out.println(sum_a_b);
        System.out.println(sum_a_b);
    }
}

