import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n_tortov = scanner.nextInt();
        String tort;
        int last = n_tortov % 10;
        int secons_l = n_tortov % 100;
        System.out.println(last);
        System.out.println(secons_l);

        if (secons_l >= 11 && secons_l <= 20) {
            tort = "TORTOV";
        } else if (last == 1) {
            tort = "TORT";
        } else if (last >= 2 && last <= 4) {
            tort = "TORTA";
        } else {
            tort = "TORTOV";
        }

        System.out.println(n_tortov + " " + tort);
        }
    }


