package java_frappe.pyo;

public class Smartphone {
    String color;
    int volume;
    boolean power;

    void volumeUp() {
        volume++;
    }

    public Smartphone(String color, int volume, boolean power) {
        this.color = color;
        this.volume = volume;
        this.power = power;
    }

    public Smartphone(int volume, boolean power) {
        this.volume = volume;
        this.power = power;
    }

    void volumeDown(int vol) {
        volume--;
    }
    void volumeDown() {}

    void powerUp() {
        power = true;
    }

    void powerDown() {
        power = false;
    }
}
