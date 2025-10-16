package smu.Homework;
import java.util.Scanner;

public class Homework4 {

    int gcd_recursive(int m, int n) {
        if (n == 0)
            return m;
        else
            return gcd_recursive(n, m % n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Homework4 hw = new Homework4();

        System.out.print("두 수를 입력하세요: ");
        int m = sc.nextInt();
        int n = sc.nextInt();

        int result_recursive = hw.gcd_recursive(m, n);

        System.out.printf("두 수의 최대공약수는 %d입니다.\n", result_recursive);

        sc.close();
    }
}

