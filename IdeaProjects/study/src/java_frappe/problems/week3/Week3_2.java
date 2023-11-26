package java_frappe.problems.week3;
import java.util.*;

public class Week3_2 {
    public static int[] arr;
    public static int N;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("홀수 번째 수 : ");
        for (int i = 0; i < N; i+=2) {
            System.out.print(arr[i] + " ");
        }

        System.out.print("\n짝수 번째 수 : ");
        for (int i = 1; i < N; i+=2) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
