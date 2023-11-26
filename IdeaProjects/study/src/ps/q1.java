package ps;

public class q1 {

    public static void main(String[] args) {
        String s1 = "string";
        String s2 = "string";

        String s3 = new String("string");
        String s4 = new String("string");

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        System.out.println(s3 != s4);
        System.out.println( s3.equals(s4));

    }
}
