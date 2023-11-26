package java_frappe.problems.week7;

import java.util.Scanner;

public class JavaProgram {
    public static void fun(char x) throws MyException_A {
        try {
            System.out.println("FA");
            if (x == 'A')
                throw new MyException_A();
            else if (x == 'B')
                throw new MyException_B();
            System.out.println("BA");
        } catch (MyException_B e) {
            System.out.println("P1 " + e.toString());
        } catch (MyException_A e) {
            System.out.println("P2 " + e.toString());
            throw e;
        }
        finally {
            System.out.println("In finally");
        }
        System.out.println("BC");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char x = sc.next().charAt(0);
        try {
            System.out.println("A");
            fun(x);
            throw new MyException_B();
        } catch (MyException_B e) {
            System.out.println("P3 " + e.toString());
        } catch (MyException_A e) {
            System.out.println("P4 " + e.toString());
        }
        System.out.println("F");
    }
}