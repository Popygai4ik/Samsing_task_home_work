import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int x3 = scanner.nextInt();
        int x4 = scanner.nextInt();
        int o_x1 = x1 * -1;
        int o_x2 = x2 * -1;
        int o_x3 = x3 * -1;
        int o_x4 = x4 * -1;
        if (o_x2 == x1) {
            System.out.println(true);
        }
        else if (o_x3 == x2) {
            System.out.println(true);
        }
        else if (o_x4 == x3) {
            System.out.println(true);
        }
        else if (o_x1 == x4) {
            System.out.println(true);

        }
        else if (x4 == o_x3) {
            System.out.println(true);
        }
        else if (x4 == o_x1) {
            System.out.println(true);
        }
        else if (x3 == o_x2) {
            System.out.println(true);
        }
        else if (x3 == o_x1) {
            System.out.println(true);
        }
        else if (x2 == o_x4) {
            System.out.println(true);
        }
        else if (x2 == o_x1) {
            System.out.println(true);
        }
        else if (x1 == o_x4) {
            System.out.println(true);
        }
        else if (x1 == o_x3) {
            System.out.println(true);

        }
        else {
            System.out.println(false);
        }
    }
}

