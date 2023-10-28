import java.util.Scanner;
import java.util.ArrayList;

import static java.util.Collections.min;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int shislo_chifr = scanner.nextInt();
        ArrayList<String> posledovatel_pol_chifr = new ArrayList<>();
        ArrayList<String> posledovatel_otr_chifr = new ArrayList<>();
        for (int i = 0; i < shislo_chifr; i++) {
            int chifra = scanner.nextInt();
            if (chifra >= 0){
                String s = Integer.toString(chifra);
                posledovatel_pol_chifr.add(s);
            } else if (chifra < 0) {
                String s = Integer.toString(chifra);
                posledovatel_otr_chifr.add(s);
            }
        }

        String sep = " ";
        String str1 = String.join(sep, posledovatel_otr_chifr);
        String str2 = String.join(sep, posledovatel_pol_chifr);
        if (posledovatel_otr_chifr.size() > 0 && posledovatel_pol_chifr.size() > 0){
            System.out.println(str1 + " " + str2);
        } else if (posledovatel_otr_chifr.size() == 0){
            System.out.println(str2);
        } else if (posledovatel_pol_chifr.size() == 0){
            System.out.println(str1);
        }

    }
}
