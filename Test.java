import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int shislo = scanner.nextInt();
        int resultate = 0;
        for (int i = 25; i < shislo; i++) {
            if (i % 2 == 0) {
                resultate += i;
            }
        }
        System.out.println(resultate);
        }
    }

