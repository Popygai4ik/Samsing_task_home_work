import java.util.Scanner;
import java.util.ArrayList;

import static java.util.Collections.min;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<String> posledovatelnosti = new ArrayList<>();
        for (int i = 4; posledovatelnosti.size() < n; i += 3) {
            String s = Integer.toString(i);
            posledovatelnosti.add(s);
        }
        String sep = " ";
        String str = String.join(sep, posledovatelnosti);
        System.out.println(str);
//        for (int i: posledovatelnosti) {
//            System.out.println(i);
//        }
    }
}
