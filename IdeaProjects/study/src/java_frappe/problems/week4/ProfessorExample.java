package java_frappe.problems.week4;

public class ProfessorExample {
    public static void main(String[] args) {
        Professor john = new Professor();
        john.height = 180;
        john.weight = 80;
        john.age = 54;
        for(int i=0; i<4; i++) {
            john.eat();
            john.teach();
            john.score();
            john.eat();
        }
        System.out.printf("키 : %d, 몸무게 : %d, 나이 : %d", john.height, john.weight, john.age);
    }
}
