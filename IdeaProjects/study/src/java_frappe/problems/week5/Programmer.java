package java_frappe.problems.week5;

public class Programmer extends Person{
    String computer;
    public Programmer(IdCard idCard, String computer) {
        super(idCard);
        this.computer = computer;
    }

    public void coding(){
        System.out.println("Coding with " + computer);
    }
}
