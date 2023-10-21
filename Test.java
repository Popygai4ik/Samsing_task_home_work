import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer second_proshlo = scanner.nextInt();
        Integer seconds = second_proshlo % 60;
        Integer minutes = second_proshlo % 3600 / 60;
        Integer hours = second_proshlo / 3600 % 24;
        String seconrs_str = Integer.toString(seconds);
        Integer len_seconds = seconrs_str.length();
        String minutes_str = Integer.toString(minutes);
        Integer len_minutes = minutes_str.length();
        if (len_seconds == 1) {
            seconrs_str = "0" + seconrs_str;
        }
        if (len_minutes == 1){
            minutes_str = "0" + minutes_str;
        }
        System.out.println(hours + ":" + minutes_str + ":" + seconrs_str);
    }
}
