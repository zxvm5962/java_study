package catch_java.test4;

public class Main {
    public static void main(String[] args) {
        Generic<Integer> a = new Generic<>();
        a.set(10);
        System.out.println(a.get());
    }
}
