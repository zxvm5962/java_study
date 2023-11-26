package java_frappe.problems.week4;

public class Test {
    public static void main(String[] args) {
        Student s = new Student("구도영",2,1,100,80,90);
        String str = s.info();
        System.out.println(str);

        Student t = new Student("홍현욱",1,1);
        System.out.println(t);
    }
}
