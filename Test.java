import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int i = scanner.nextInt();

        int mask = (1 << i) - 1;
        int res = a & mask;

        System.out.println(res);
    }
}

