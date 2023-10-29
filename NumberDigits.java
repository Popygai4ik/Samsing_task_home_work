import java.util.ArrayList;
import java.util.Scanner;

public class NumberDigits {
    public static int sumOfDigits(int shislo) {
        int stifra = 0;
        int shetcik = 0;
        ArrayList<Integer> spisok = new ArrayList<>();
        while (shislo > 0) {
            stifra = shislo % 10;
            spisok.add(stifra);
            shislo = shislo / 10;
        }
        for (int i = 0; i < spisok.size(); i++) {
            shetcik = shetcik + spisok.get(i);
        }
        return shetcik;
    }

}
