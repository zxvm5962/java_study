package java_frappe.problems.week2;
import java.util.*;

public class Week2_2 {
    private static int num1, num2, num3;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();

        int mul = num1 * num2 * num3;
        int avg = (int)((num1 + num2 + num3) / 3);

        System.out.println("곱 : " + mul);
        System.out.println("평균 : " + avg);
    }
}
