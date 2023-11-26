package catch_java.test2;

public class Bh extends Player{

    @Override
    public void run() {
        System.out.println("뛴다.");
    }
    @Override
    public void eat() {
        System.out.println("먹는다.");
    }

    public static void main(String[] args) {
        Bh bh = new Bh();
        bh.run();
        bh.eat();
    }
}