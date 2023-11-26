package java_frappe.problems.week6.p2;

public class Main {
    public static void main(String[] args) {
        Person person1, person2;
        person1 = new Person("허종구", new Date("January", 1, 2021));
        person2 = new Person(person1);

        System.out.println(person1);
        System.out.println(person2);

        person1.getBorn().setDate("April", 1, 2021);
        System.out.println(person1);
        System.out.println(person2);


        Person person3;
        person3 = new Person("유동연", new Date("January", 1, 2021));
        System.out.println(person3);
        person3.getBorn().setDate("April", 1, 2021);
        System.out.println(person3);
    }
}