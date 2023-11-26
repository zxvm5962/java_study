package java_frappe.problems.week4;

public class Student {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    public String info(){
        return name + ", " + ban + " - " + no + ", 국어 : "  + kor + ", 수학 : " + math + ", 영어 : " + eng;
    }
    public Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public Student(String name, int ban, int no) {
        this.name = name;
        this.ban = ban;
        this.no = no;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", ban=" + ban +
                ", no=" + no +
                ", kor=" + kor +
                ", eng=" + eng +
                ", math=" + math +
                '}';
    }
}
