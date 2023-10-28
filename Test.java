import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int resultsti = 0;
        int shislo = 0;

        while (true) {
            shislo = scanner.nextInt();
            if (shislo % 5 == 0) {
                if (shislo > 10) {
                    resultsti += shislo;
                    }
                break;
            } else if (shislo > 10) {
                resultsti += shislo;
            }
        }
        System.out.println(resultsti);
        }
    }

