import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        StringBuilder res = new StringBuilder();
        if (X == 100) {
            res.append("C");
            X -= 100;
        }
        if (X >= 90) {
            res.append("XC");
            X -= 90;
        }
        if (X >= 50) {
            res.append("L");
            X -= 50;
        }
        if (X >= 40) {
            res.append("XL");
            X -= 40;
        }
        while (X >= 10) {
            res.append("X");
            X -= 10;
        }
        if (X >= 9) {
            res.append("IX");
            X -= 9;
        }
        if (X >= 5) {
            res.append("V");
            X -= 5;
        }
        if (X >= 4) {
            res.append("IV");
            X -= 4;
        }
        while (X >= 1) {
            res.append("I");
            X -= 1;
        }
        String res_str = res.toString();
        System.out.println(res_str);
        }


    }
