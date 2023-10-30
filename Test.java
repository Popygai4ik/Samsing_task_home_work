import java.util.ArrayList;
import java.util.Scanner;

import static java.util.Collections.min;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int f = 0;
        int shitshik = 0;
        boolean flag = false;
        ArrayList<Integer> spisok = new ArrayList<>();
        for (int i = 0; i < n; i++){
            f = scanner.nextInt();
            spisok.add(f);
        }
//        System.out.println(spisok);
        for (int x: spisok){
            shitshik++;
            if (x <= 437){
             flag = true;
             break;
            }
        }
        if (flag){
            System.out.println("Crash " + shitshik);
        }else {
            System.out.println("No crash");
        }


}}