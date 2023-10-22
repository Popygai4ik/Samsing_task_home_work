import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();

        if ((A == 0&& B > 0)||(-B/A < 0 && A>0 )){
            System.out.println("any x");
        } else if ((A == 0 && B != 0)|| (A < 0 && B < 0) ||(A == 0 && B == 0)) {
            System.out.println("no such x");
        } else {
            double x1 = -B / A;
            String res_x1 = String.format("%.1f", x1);
//            System.out.println(x1);
            double m_x1 = -x1;
            String res_m_x1 = String.format("%.1f", m_x1);
            if ((A > 0 && 0 > -B/A) || (A > 0 && -B/A > 0)) {
                System.out.println("x" + "<" + res_m_x1 + " or " +"x>" + res_x1);
            }
            if ((A < 0 && 0 < -B/A) || ((A < 0 && -B/A > 0))) {
                System.out.println(res_m_x1 + "<x<" + res_x1);
            }
        }


    }
}