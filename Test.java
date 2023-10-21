import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int a = String.valueOf(x).length();

        if (a == 3 && x % 5 == 0 && x >= 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        }
    }

