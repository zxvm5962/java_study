package java_frappe.pyo;

public class SmartphoneExample {
    public static void main(String[] args) {
        Smartphone s23 = new Smartphone(1,true);
        System.out.println(s23.power);
        s23.volumeUp();
        System.out.println(s23.volume);
        s23.powerUp();
        System.out.println(s23.power);
    }
}
