package java_frappe.problems.week2;
import java.util.*;
public class Week2_3 {
    private static int N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int count = 1;
        while(count < 10){
            System.out.println(N + " * " + count + " = " + N * count);
            count ++;
        }
    }
}
