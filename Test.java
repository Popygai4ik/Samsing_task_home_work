import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        ArrayList<Integer> res = new ArrayList<>();
        res.add(n);
        res.add(n2);
        res.add(n3);
        System.out.println(Collections.max(res));

        }


    }
