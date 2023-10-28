import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int shislo = scanner.nextInt();
        int shetchik = 1;
        while (shislo >= 0) {
            shetchik++;
            shislo = scanner.nextInt();
        }
        System.out.println(shetchik);
    }
}
