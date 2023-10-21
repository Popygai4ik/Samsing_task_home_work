import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (0 <= n && n < 10) {
            System.out.println("DIGIT");
        } else if (10 <= n && n < 100) {
            System.out.println("NUM");
        } else {
            System.out.println("OTHER");
        }
    }
}

