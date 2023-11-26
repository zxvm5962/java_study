package java_frappe.problems.week5;

public class Main {
    public static void main(String[] args) {
        IdCard idCard1 = new IdCard("Zeus", 21);
        IdCard idCard2 = new IdCard("Faker",28);
        Dancer dancer = new Dancer(idCard1, "Air force");
        Programmer programmer = new Programmer(idCard2, "gram");

        dancer.walk();
        dancer.dancing();

        programmer.coding();
    }
}
