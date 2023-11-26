package catch_java.test;

public class People {
    //속성 대부분 명사
    private int age;
    private int height;
    private String name;

    public People(String name, int age, int height){
        this.name = name;
        this.age = age;
        this. height = height;
    }
    public String toString(){
        return "이름은" + name + "이고, 나이는" + age + ", 키는 " + height + "입니다.";
    }

    public static void main(String[] args) {
        People[] people = {
                new People("유동연",24,174),
                new People("허종구", 23,180),
                new People("표준성", 20,180)
        };

        for(int i=0; i<3; i++){
            System.out.println(people[i]);
        }
    }

}
