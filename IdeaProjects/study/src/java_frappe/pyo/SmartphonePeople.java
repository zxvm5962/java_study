package java_frappe.pyo;

public class SmartphonePeople {
    public static void main(String[] args) {
        Smartphone s23 = new Smartphone("Red",10, false);
        s23.volumeDown();
        System.out.println(s23.volume);
    }
}
