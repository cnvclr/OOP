package smu.Homework;
import java.util.Scanner;



public class Homework3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("몇 개의 정수를 입력할 예정인가요? ");
        int freq = sc.nextInt();
        int[] arr = new int[freq];
        System.out.printf("수를 입력하세요: ");
        for (int i = 0; i < freq; i++) {
            arr[i] = sc.nextInt();
        }

        int maxIdx = 0; // 첫 원소 기준
        for (int i = 1; i < freq; i++) {
            if (arr[i] > arr[maxIdx]) {
                maxIdx = i;
            }
        }
        int minIdx = 0; // 첫 원소 기준
        for (int i = 1; i < freq; i++) {
            if (arr[i] < arr[minIdx]) {
                minIdx = i;
            }
        }

        System.out.printf("최댓값: %d\n", arr[maxIdx]);
        System.out.printf("최솟값: %d\n", arr[minIdx]);
        sc.close();
    }
}
