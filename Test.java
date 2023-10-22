import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int c = 0;
        int god = 365;
        if (n == 1) {
            c = 0;
            if (k >=1 && k <= 31){
                System.out.println(god - (c + k));
            }else {
                System.out.println(-1);
            }
        } else if (n == 2) {
          c = 31;
            if (k >=1 && k <= 28){
                System.out.println(god - (c + k));
            }else {
                System.out.println(-1);
            }

        } else if (n == 3) {
            c = 59;
            if (k >=1 && k <= 31){
                System.out.println(god - (c + k));
            }else {
                System.out.println(-1);
            }
        } else if (n == 4) {
            c = 90;
            if (k >=1 && k <= 30){
                System.out.println(god - (c + k));
            }else {
                System.out.println(-1);
            }
        } else if (n == 5) {
            c = 120;
            if (k >=1 && k <= 31){
                System.out.println(god - (c + k));
            }else {
                System.out.println(-1);
            }
        } else if (n == 6) {
            c = 151;
            if (k >=1 && k <= 30){
                System.out.println(god - (c + k));
            }else {
                System.out.println(-1);
            }
        } else if (n == 7) {
            c = 181;
            if (k >=1 && k <= 31){
                System.out.println(god - (c + k));
            }else {
                System.out.println(-1);
            }
        } else if (n == 8) {
            c = 212;
            if (k >=1 && k <= 31){
                System.out.println(god - (c + k));
            }else {
                System.out.println(-1);
            }
        } else if (n == 9) {
            c = 243;
            if (k >=1 && k <= 30){
                System.out.println(god - (c + k));
            }else {
                System.out.println(-1);
            }
        } else if (n == 10) {
            c = 273;
            if (k >=1 && k <= 31){
                System.out.println(god - (c + k));
            }else {
                System.out.println(-1);
            }
        } else if (n == 11) {
            c = 304;
            if (k >=1 && k <= 30){
                System.out.println(god - (c + k));
            }else {
                System.out.println(-1);
            }
        } else if (n == 12) {
            c = 334;
            if (k >=1 && k <= 31){
                System.out.println(god - (c + k));
            }else {
                System.out.println(-1);
            }
        } else{
            System.out.println(-1);
            }
        }


    }
