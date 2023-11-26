package java_frappe.problems.week5;

public class Dancer extends Person {
    String shoes;

    public Dancer(IdCard idCard, String shoes) {
        super(idCard);
        this.shoes = shoes;
    }

    @Override
    public void walk() {
        System.out.println("Walk in unique " + shoes);
    }

    public void dancing() {
        System.out.println("Tab dancing wearing " + shoes);
    }
}
