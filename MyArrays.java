import java.util.*;

public class MyArrays {
    public static String avgOf4Digit(int[] arr) {
    Scanner scanner = new Scanner(System.in);
//        List spisok = Arrays.asList(new Object[]{arr});
        ArrayList<Integer> spisok2 = new ArrayList<>();
        int p = 0;
        double res = 0;
        int t = 0;
        int sum = 0;
//        int kolvo = scanner.nextInt();
        for (int j : arr) {
            t = j;
            int dlina = String.valueOf(t).length();
            if (dlina == 4) {
                spisok2.add(t);
            }
        }
//        System.out.println(spisok2);
        for (int x: spisok2) {
            sum = sum + x;
        }
        if (spisok2.size() == 0) {
            double d = -1;
            String result = String.format("%.2f",d);
            return result;
        }else {
            res = (double) sum / spisok2.size();
            String result = String.format("%.2f",res);
            return result;
        }}
    public static String minToBegin(int[] arr) {
        ArrayList<Integer> spisok2 = new ArrayList<>();
        ArrayList<String> spisok = new ArrayList<>();
        int t = 0;
//        int min = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] < min) {
//                min = arr[i];
//            }
//        }
        for (int i = 0; i < arr.length; i++) {
            t = arr[i];
            spisok2.add(t);
        }
//        System.out.println(spisok2);
        int min = Collections.min(spisok2);
//        System.out.println(min);
        for (int i = 0; i < spisok2.size(); i++) {
            if (spisok2.get(i) == min) {
                spisok2.remove(i);
                break;
            }
        }
        spisok2.add(0, min);
        for (int x: spisok2) {
            spisok.add(String.valueOf(x));
        }
//        System.out.println(spisok2);
        String sep = " ";
        String str = String.join(sep, spisok);
        return str;

    }
}
