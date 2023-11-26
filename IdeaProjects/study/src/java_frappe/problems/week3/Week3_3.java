package java_frappe.problems.week3;

import java.util.*;

public class Week3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        char C = sc.next().charAt(0);

        int[] arr = new int[str.length()];
        int k = 0;

        for (int i = 0; i < str.length(); i++) {
            char V = str.charAt(i);
            if (V == C) {
                arr[k] = i;
                k++;
            }
        }

        if (k > 0) {
            System.out.print("해당 문자의 인덱스: ");
            for (int i = 0; i < k; i++) {
                System.out.print(arr[i] + " ");
            }
        }
        else {
            System.out.println("해당 문자가 없습니다.");
        }

        sc.close();
    }
}
