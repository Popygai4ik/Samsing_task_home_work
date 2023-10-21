import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer b = scanner.nextInt();
        Integer trith = 0;
        Integer second = 0;
        Integer first = 0;
        first = b / 10 / 10;
        second = b % 100 / 10;
        trith = b % 10;
        Integer res = first + second + trith;
        System.out.println(res);
    }
}

