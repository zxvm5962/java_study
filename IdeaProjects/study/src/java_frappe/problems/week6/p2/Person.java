package java_frappe.problems.week6.p2;

public class Person {
    private String name;
    private Date born;

    public Person(String name, Date born) {
        this.name = name;
        this.born = born;
    }

    public Person(Person aPerson){
        if (aPerson == null) { //Not a real date.
            System.out.println("Fatal Error.");
            System.exit(0);
        }
        name = aPerson.name;
        born = new Date(aPerson.born);
    }

    public Date getBorn() {
        return new Date(born);
    }

    public String toString() {
        return (name + ", " + born);
    }
}