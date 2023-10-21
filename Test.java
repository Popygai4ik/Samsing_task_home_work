import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();

        if (3 <= x && x <= 8) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
//        Scanner scanner = new Scanner(System.in);
//        float x = scanner.nextFloat();
//        System.out.println(x);
////        if ((x >= 3) && (x <=8 )){
////            System.out.println(true);
////
////        }
////        else {
////            System.out.println(false);
        }
    }

