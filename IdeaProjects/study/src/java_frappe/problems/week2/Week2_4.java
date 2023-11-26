package java_frappe.problems.week2;
import java.util.*;
public class Week2_4 {
    private static int N;
    public static void main(String[] args) {
        Random random = new Random();
        random.setSeed(System.currentTimeMillis());
        N = random.nextInt(100);
        System.out.println("생성된 N의 값은 " + N + " 이고,");

        if(N % 6 == 0)
            System.out.println("2의 배수면서 3의 배수입니다.");
        else if(N % 2 == 0)
            System.out.println("2의 배수입니다.");
        else if(N % 3 == 0)
            System.out.println("3의 배수입니다.");
        else
            System.out.println("2의 배수도, 3의 배수도 아닙니다.");

    }
}
