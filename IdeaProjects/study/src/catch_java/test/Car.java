package catch_java.test;

public class Car {
    private String name;
    private String number;
    private int width;
    private int height;
    private double x;
    private double y;
    public Car(String name, String number,int width, int height, double x, double y){
        this.name = name;
        this.number = number;
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
    }
    public Car(String name, String number){
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String toString(){
        return "차 이름은 " + name + "이고, 넘버는 " + number + "입니다.";
    }

    public static void main(String[] args) {
        Car car = new Car("소나타","123",50,100,32.3,21.2);
        Car car2 = new Car("소나타","123");
        Car car3 = new Car("소나타","123",22,33,232,131);
        System.out.println(car);
        System.out.println(car2);
        System.out.println(car3);
    }

}
