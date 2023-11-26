package java_frappe.pyo;

public class HumanExample {
    public static void main(String[] args) {
        Human junseong =  new Human();

        System.out.println(junseong.height);

        junseong.height = 180;
        junseong.weight = 75;
        junseong.age = 20;

        System.out.println(junseong.height);
        System.out.println(junseong.weight);
        System.out.println(junseong.age);
    }
}
