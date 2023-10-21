import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int shislo_des = x / 10 % 10;
        System.out.println(shislo_des);
    }
}

