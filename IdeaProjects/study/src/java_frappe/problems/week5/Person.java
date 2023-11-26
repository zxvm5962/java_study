package java_frappe.problems.week5;

public class Person {
    IdCard idCard;

    public Person(IdCard idCard) {
        this.idCard = idCard;
    }

    public void walk(){
        System.out.println("Walk around");
    }
    public void eat(String food){
        System.out.println("Eat " + food);
    }

}
