import java.util.ArrayList;

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
    public static int sumOfSeven(int shislo, int shislo2) {
        int shitshik = 0;
        int stifra1 = 0;
        int stifra2 = 0;
//        int shetcik = 0;
//        System.out.println(shislo + " " + shislo2);
        ArrayList<Integer> spisok = new ArrayList<>();
        for (int i = shislo; i <= shislo2; i++) {
//            System.out.println(i);
            if (i % 7 == 0 && i < 100 && i > 9) {
                spisok.add(i);

            }
        }
        for (int x: spisok) {
            stifra1 = x % 10;
            stifra2 = x / 10;
//            System.out.println(stifra1 + " " + stifra2);
            shitshik = shitshik + stifra1 + stifra2;
//            System.out.println(shitshik);


        }
//        System.out.println(spisok);
        return shitshik;
    }
    public static int sumOfThirteen(int shislo) {
        ArrayList<Integer> spisok = new ArrayList<>();
        ArrayList<Integer> v_spisok2 = new ArrayList<>();
        int stifra1 = 0;
        int shitshik = 0;
        int f = 0;
        for (int i = shislo - 1; i >= 0; i--) {
            f = i;
            while (f > 0){
                stifra1 = f % 10;
                v_spisok2.add(stifra1);
                f = f / 10;
            }
            for (int x: v_spisok2) {
                shitshik += x;
            }
            if (shitshik % 13 == 0){
                spisok.add(i);
            }
            v_spisok2.clear();
            shitshik = 0;
        }
//        System.out.println(spisok);
        int kolvo = spisok.size();
        return kolvo;
    }
    public static Integer binFraction(double shuslo, int shuslo2){
        ArrayList<String> spisok = new ArrayList<>();
        int f = 0;
        for (int i = 0; i < shuslo2; i++) {
            shuslo = shuslo * 2;
            f = (int) shuslo;
            String str2 = String.valueOf(f);
            spisok.add(str2);
            shuslo = shuslo % 1;
        }
        String sep = "";
        String str = String.join(sep, spisok);
        System.out.println(str);
        return -1;
    }
}
