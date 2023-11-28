package java_frappe.problems.week8;

public class Drink {
    private String name;
    private int price;
    // 생성자

    public Drink(String name, int price) {
        this.name = name;
        this.price = price;
    }
    //음료 정보를 문자열로 반환
    public String getDrink(){
        return name;
    }
}
