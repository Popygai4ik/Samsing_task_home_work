import java.util.Scanner;
import java.util.ArrayList;

import static java.util.Collections.min;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int shislo_chifr = scanner.nextInt();
        ArrayList<Integer> posledovatel_chifr = new ArrayList<>();
        ArrayList<String> posledovatel_obr_chifr = new ArrayList<>();
        for (int i = 0; i < shislo_chifr; i++) {
            int chifra = scanner.nextInt();
            posledovatel_chifr.add(chifra);
        }
        for (int i = shislo_chifr - 1; i >= 0; i--) {
            String s = Integer.toString(posledovatel_chifr.get(i));
            posledovatel_obr_chifr.add(s);
        }
        String sep = " ";
        String str = String.join(sep, posledovatel_obr_chifr);
        System.out.println(str);
    }
}
