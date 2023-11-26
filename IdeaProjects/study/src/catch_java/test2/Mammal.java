package catch_java.test2;

public class Mammal extends Animal {
    private int num;
    public Mammal(String name, int age) {
        super(name, age);
    }

    public Mammal(int num, String name, int age){
        super(name,age);
        this.num = num;
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "num=" + num +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
