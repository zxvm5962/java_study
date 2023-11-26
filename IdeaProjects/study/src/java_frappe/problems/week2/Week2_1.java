package java_frappe.problems.week2;

import java.util.Scanner;

public class Week2_1 {
    private static int num1, num2, num3;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();

        int max;

        max = (num1 > num2) ? num1 : num2;
        max = (max > num3) ? max : num3;

        System.out.println("최댓값 : " + max);

    }
}
