import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

import static java.util.Collections.min;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int shislo = scanner.nextInt();
        ArrayList<Integer> cifri_spickom = new ArrayList<>();
        while (shislo > 0) {
            int shifra = shislo % 10;
            cifri_spickom.add(shifra);
            shislo = shislo / 10;
        }
        cifri_spickom.removeAll(Arrays.asList(Integer.valueOf(0)));
//        System.out.println(cifri_spickom);
        int dlina = cifri_spickom.size();
//        System.out.println(dlina);
        if (dlina > 0) {
            int min = cifri_spickom.get(0);
            for (int i = 1; i < cifri_spickom.size(); i++) {
                if (cifri_spickom.get(i) < min && cifri_spickom.get(i) != 0) {
                    min = cifri_spickom.get(i);
                }
            }
            System.out.println(min);
        } else {
            System.out.println("NO");
        }
    }
}
