import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if ((n & (n - 1)) == 0) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }
    }
}

